package com.ams.api.interceptor;

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.sql.Timestamp;

import jakarta.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ams.api.audit.entity.NgiAuditLog;
import com.ams.api.audit.repository.NgiAuditLogRepository;
import com.ams.api.service.AuditLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;
import org.springframework.web.util.WebUtils;

import com.ams.api.util.CommonUtils;
import com.ams.api.util.SessionMap;
import com.ams.api.util.GlobalProperties;

import static com.ams.api.util.GlobalConstant.*;*/

//@Component
public class NgiAuditInterceptor /*extends OncePerRequestFilter*/ {
/*

    private static final Logger LOGGER = LoggerFactory.getLogger(NgiAuditInterceptor.class);
    private static final int DEFAULT_MAX_PAYLOAD_LENGTH = 1024;

    @Autowired
    private GlobalProperties properties;

    @Autowired
    private NgiAuditLogRepository manifestAuditLogRepository;

    @Autowired
    private AuditLogService auditLogService;
    @Autowired
    private JdbcTemplate auditJdbcTemplate;

    @Value("${log.sequence-name}")
    private String logSequenceName;
    @Value("${log.trace-id-prefix}")
    private String traceIdPrefix;

    @Value("${spring.application.name}")
    private String serviceName;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        Timestamp createdTime = new Timestamp(System.currentTimeMillis());
        Timestamp responseTime = null;
        HttpServletRequest requestToUse = request;
        HttpServletResponse responseToUse = response;
        boolean isFirstRequest = !isAsyncDispatch(request);



        try {
            BigDecimal sequence;
            if (logSequenceName.isEmpty()) {
                sequence = manifestAuditLogRepository.getNextSeriesId();
            }else{
                sequence = auditJdbcTemplate.queryForObject(String.format("SELECT %s.NEXTVAL FROM DUAL", logSequenceName), BigDecimal.class);
            }
            SessionMap.setContext(KEY_MAP_TRACE_ID, CommonUtils.generateTransactionId(sequence, traceIdPrefix));
            MDC.put(KEY_MAP_TRACE_ID, String.valueOf(SessionMap.getValue(KEY_MAP_TRACE_ID)));
            MDC.put(KEY_MAP_SPAN_ID, request.getRemoteAddr());
            SessionMap.setContext(KEY_MAP_API_VERSION, "v1");
            SessionMap.setContext(KEY_MAP_USER_ID, request.getHeader(KEY_MAP_USER_ID));
            String channelId = request.getHeader(KEY_MAP_CHANNEL_ID);
            SessionMap.setContext(KEY_MAP_CHANNEL_ID, channelId);
            SessionMap.setContext(KEY_MAP_TRANSACTION_ID, request.getHeader(KEY_MAP_TRANSACTION_ID));
            SessionMap.setContext(KEY_MAP_TXN_DATE, request.getHeader(KEY_MAP_TXN_DATE));
            SessionMap.setContext(KEY_MAP_ORG_REF_TXN_NO, request.getHeader(KEY_MAP_ORG_REF_TXN_NO));
            SessionMap.setContext(KEY_MAP_MSG_TYP, request.getHeader(KEY_MAP_MSG_TYP));
            SessionMap.setContext(KEY_MAP_TXN_KEY, request.getHeader(KEY_MAP_TXN_KEY));
            SessionMap.setContext(KEY_MAP_CHANNEL_DIRECT, request.getHeader(KEY_MAP_CHANNEL_DIRECT));
            SessionMap.setContext(KEY_MAP_CODE_ORG_BRN, request.getHeader(KEY_MAP_CODE_ORG_BRN));

            SessionMap.setContext(KEY_MAP_SVC_RQ_ID, request.getHeader(KEY_MAP_SVC_RQ_ID));
            SessionMap.setContext(KEY_MAP_SVC_CODE, request.getHeader(KEY_MAP_SVC_CODE));
            SessionMap.setContext(KEY_MAP_TRN_REF_NUM, request.getHeader(KEY_MAP_TRN_REF_NUM));

            if (isFirstRequest) {
                requestToUse = wrapRequest(request);
            }

            responseToUse = wrapResponse(response);
            LOGGER.debug("responseToUse : {}", responseToUse.getStatus());

            filterChain.doFilter(requestToUse, responseToUse);

            responseTime = new Timestamp(System.currentTimeMillis());
        } finally {
            if (properties != null && properties.isGlobalAuditLog() && !isAsyncStarted(requestToUse)) {
                logRequestResponse(requestToUse, responseToUse, createdTime, responseTime);
            }
        }

    }


    public int getMaxPayloadLength() {
        return DEFAULT_MAX_PAYLOAD_LENGTH;
    }

    // log Request
    private void logRequestResponse(HttpServletRequest req, HttpServletResponse resp, Timestamp createdTime,
                                    Timestamp responseTime) {

        String requestJson = null;
        String responseJson = null;
        NgiAuditLog auditlog = null;

        try {

            String urlRequest = getURL(req);
            String httpMethod = getMethod(req);
            String client = getClient(req);
            String httpHeader = getHeader(req);
            String requestStr = getRequest(req);
            String responseStr = getResponse(resp);
            String queryString = getQueryString(req);

            String responseStatus = getStatus(resp);
            String podName = getPodName();

            if (CommonUtils.isBypassedEndpoint(urlRequest)) {
                return;
            }

            requestJson = requestStr;
            responseJson = responseStr;

            String requestUserId = (String) SessionMap.getValue(KEY_MAP_USER_ID);
            String traceId = (String) SessionMap.getValue(KEY_MAP_TRACE_ID);
            String comments = (String) SessionMap.getValue(KEY_MAP_COMMENTS);
            String transactionId = (String) SessionMap.getValue(KEY_MAP_TRANSACTION_ID);
            String refTxnNo = (String) SessionMap.getValue(KEY_MAP_REF_TXN_NO);
            if(transactionId == null || transactionId.isEmpty()) {
                transactionId = String.valueOf(SessionMap.getValue(KEY_MAP_SVC_RQ_ID));
            }
            auditlog = new NgiAuditLog();
            auditlog.setTraceId(traceId);
            auditlog.setUrl(urlRequest);
            auditlog.setHttpMethod(httpMethod);
            auditlog.setClient(client);
            auditlog.setHttpHeader(httpHeader);
            auditlog.setRequest(requestJson.getBytes());
//            auditlog.setRequest(((String) Objects.requireNonNull(SessionMap.getValue(KEY_MAP_REQUEST_BODY))).getBytes());
            auditlog.setResponse(responseJson.getBytes());
            auditlog.setRequestUserId(requestUserId);
            auditlog.setComments(comments);
            auditlog.setQueryString(queryString);
            auditlog.setResponseStatus(responseStatus);
            auditlog.setProcessingStartTime(createdTime);
            auditlog.setProcessingEndTime(responseTime);
            if (responseTime!=null){
                auditlog.setProcessTime(responseTime.getTime() - createdTime.getTime());
            }
            auditlog.setRequestTime(createdTime);
            auditlog.setContainerId(podName);
            auditlog.setInsertTime(new Timestamp(System.currentTimeMillis()));
            auditlog.setTransactionId(transactionId);
            auditlog.setRefTxnNo(refTxnNo);

            auditlog.setHttpStatusCode(resp.getStatus() + "");
            auditlog.setServiceName(serviceName);

            auditLogService.saveAuditLog(auditlog);

            SessionMap.remove();

        } catch (Exception e) {
            LOGGER.error("Error in Audit :");
            e.printStackTrace();
        }
    }

    // Get Method
    private String getPodName() {
        String podName = System.getenv("HOSTNAME");
        if (podName == null) {
            podName = "";
        }
        return podName;
    }

    // Get Method
    private String getMethod(HttpServletRequest request) {
        return request.getMethod();
    }

    // Get Responsestaus
    private String getStatus(HttpServletResponse response) {
        return Integer.toString(response.getStatus());
    }

    // Get URL
    private String getURL(HttpServletRequest request) {
        return request.getRequestURI();
    }

    // Get QueryString
    private String getQueryString(HttpServletRequest request) {
        String queryString = request.getQueryString();
        if (queryString == null) {
            queryString = "";
        }
        return queryString;
    }

    // Get Client
    private String getClient(HttpServletRequest request) {
        String client = request.getRemoteAddr();
        if (!StringUtils.hasLength(client)) {
            client = "";
        }
        return client;
    }

    // Get Header
    private String getHeader(HttpServletRequest request) {
        String httpHeader = String.valueOf(new ServletServerHttpRequest(request).getHeaders());
        if (!StringUtils.hasLength(httpHeader)) {
            httpHeader = "";
        }
        return httpHeader;
    }

    // Get Request
    private String getRequest(HttpServletRequest request) {

        StringBuilder msg = new StringBuilder();
        ContentCachingRequestWrapper wrapper = WebUtils.getNativeRequest(request, ContentCachingRequestWrapper.class);
        if (wrapper != null) {
            byte[] buf = wrapper.getContentAsByteArray();
            if (buf.length > 0) {
                int length = buf.length;
                String payload;
                try {
                    payload = new String(buf, 0, length, wrapper.getCharacterEncoding());
                } catch (UnsupportedEncodingException ex) {
                    payload = "[unknown]";
                }
                msg.append(payload);
            }
        }
        return msg.toString();
    }
    private String getRequestBody(HttpServletRequest request) throws IOException {
        StringBuilder requestBody = new StringBuilder();
        try (BufferedReader reader = request.getReader()) {
            char[] buffer = new char[1024];
            int bytesRead;
            while ((bytesRead = reader.read(buffer)) != -1) {
                requestBody.append(buffer, 0, bytesRead);
            }
        }
        return requestBody.toString();
    }

    // Get Response
    private String getResponse(HttpServletResponse resp) {

        StringBuilder msg = new StringBuilder();

        ContentCachingResponseWrapper responseWrapper = WebUtils.getNativeResponse(resp,
                ContentCachingResponseWrapper.class);
        if (responseWrapper != null) {
            byte[] buf = responseWrapper.getContentAsByteArray();
            try {
                responseWrapper.copyBodyToResponse();
            } catch (IOException e) {
                LOGGER.error("Fail to write response body back", e);
            }
            if (buf.length > 0) {
                String payload;
                try {
                    payload = new String(buf, 0, buf.length, responseWrapper.getCharacterEncoding());
                } catch (UnsupportedEncodingException ex) {
                    payload = "[unknown]";
                }
                msg.append(payload);
            }
        }
        return msg.toString();

    }

    // Get Company
    private String getCompany(HttpServletRequest request) {
        String company = "";
        String authHeader = request.getHeader("Authorization");
        if (StringUtils.hasText(authHeader)) {
            String[] headerToken = authHeader.split(" ");
            String companyCode = headerToken[0];
            if ((companyCode != null) && !(companyCode.equals(""))) {
                company = companyCode;
            }
        }
        return company;
    }

    private ContentCachingRequestWrapper wrapRequest(HttpServletRequest request) {
        if (request instanceof ContentCachingRequestWrapper) {
            return (ContentCachingRequestWrapper) request;
        } else {
            return new ContentCachingRequestWrapper(request);
        }
    }

    private ContentCachingResponseWrapper wrapResponse(HttpServletResponse response) {
        if (response instanceof ContentCachingResponseWrapper) {
            return (ContentCachingResponseWrapper) response;
        } else {
            return new ContentCachingResponseWrapper(response);
        }
    }
*/


}
