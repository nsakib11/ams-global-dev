package com.ams.api.interceptor;

/*import java.io.IOException;
import java.util.Collections;

import vlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.core.MediaType;

import com.ams.api.payload.response.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ams.api.model.CustomError;
import com.ams.api.model.CustomResponse;
import com.ams.api.payload.response.VerifyUserResponse;
import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.ams.api.util.AuthServerInterface;
import com.ams.api.util.SessionMap;
import com.ams.api.util.GlobalProperties;

import static com.ams.api.util.GlobalConstant.*;*/

//@Component
public class NgiAuthInterceptor /*implements Filter*/ {

    /*private static final Logger logger = LoggerFactory.getLogger(NgiAuthInterceptor.class);

    @Autowired
    private AuthServerInterface authServerInterface;

    @Autowired
    private GlobalProperties properties;

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        logger.debug("AccessFilter doFilter");
//        SessionMap.remove();

        HttpServletRequest httpServletRequest = ((HttpServletRequest) request);
     
        MultiReadHttpServletRequest wrappedRequest = new MultiReadHttpServletRequest(httpServletRequest);
        request = wrappedRequest;

        if (HttpMethod.OPTIONS.name().equalsIgnoreCase(wrappedRequest.getMethod())) {
            ((HttpServletResponse) response).setHeader("Access-Control-Allow-Origin", properties.getAllowedDomains());
            ((HttpServletResponse) response).setHeader("Access-Control-Allow-Methods",
                    "POST, GET, PUT, OPTIONS, DELETE");
            ((HttpServletResponse) response).setHeader("Access-Control-Max-Age", "3600");
            ((HttpServletResponse) response).setHeader("Access-Control-Allow-Headers",
                    "Origin, X-Requested-With, Content-Type, Accept, Authorization");
            ((HttpServletResponse) response).setStatus(HttpStatus.SC_OK);
        }
        else {

            String authHeader = httpServletRequest.getHeader(KEY_MAP_AUTHORISATION);
            String requestTime = httpServletRequest.getHeader(KEY_MAP_REQUEST_TIME);
            String clientTnxKey = httpServletRequest.getHeader(KEY_MAP_TXN_KEY);
            String svcCode=httpServletRequest.getHeader(KEY_MAP_SVC_CODE);
            String svcRqId=httpServletRequest.getHeader(KEY_MAP_SVC_RQ_ID);
            String channelId=httpServletRequest.getHeader(KEY_MAP_CHANNEL_ID);
            if(channelId!=null&& !channelId.isEmpty()) {
            	 ((HttpServletResponse) response).setHeader(KEY_MAP_CHANNEL_ID, channelId);
            }
            if(svcCode!=null&& !svcCode.isEmpty()) {
            	 ((HttpServletResponse) response).setHeader(KEY_MAP_SVC_CODE, svcCode);
            	 
            }
            if(svcRqId!=null&& !svcRqId.isEmpty()) {
           	 ((HttpServletResponse) response).setHeader(KEY_MAP_SVC_RQ_ID, svcRqId);
           	 
           }
            logger.info("------------------------------------- write request info ------------------");

            String fullUrl = ((HttpServletRequest) request).getRequestURL().toString();
            logger.info("fullurl : {}", fullUrl);
            logger.info("url: {}", authServerInterface.getSha256hexUrl(fullUrl));
            logger.info("------------------------------------- write request info ------------------");

            boolean allowAccess = false;

            try {

                SessionMap.setContext(KEY_MAP_REQUEST_TIME, requestTime);

                if (httpServletRequest.getRequestURL().toString().contains("api-docs")) {
                    allowAccess = true;
                } else {
                    // checking basic auth header
                    if (properties.isAuthorizationNeeded()) {
                        final boolean isUserAuthorized = authServerInterface.isUserAuthorized(authHeader, fullUrl);

                        if (!isUserAuthorized) {
                            logger.warn("isUserAuthorized :{}", isUserAuthorized);
//                            ((HttpServletResponse) response).setStatus(HttpStatus.SC_UNAUTHORIZED);
                            ((HttpServletResponse) response).setStatus(HttpStatus.SC_UNAUTHORIZED);
                            response.setContentType(MediaType.APPLICATION_JSON);
                            CustomResponse<Response> customResponse = new CustomResponse<>();
                            customResponse.setResponse(Collections.emptyList());
                            VerifyUserResponse verifyUserResponse = (VerifyUserResponse) SessionMap.getValue(KEY_MAP_USER_AUTHORIZATION_INFO);
                            assert verifyUserResponse != null;
                            CustomError customError = new CustomError(verifyUserResponse.getStatusCode(), verifyUserResponse.getMessage(), org.springframework.http.HttpStatus.UNAUTHORIZED.getReasonPhrase());
                            customResponse.setErrors(Collections.singletonList(customError));
                            customResponse.setTraceId((String) SessionMap.getValue(KEY_MAP_TRACE_ID));
                            response.getOutputStream().write(new ObjectMapper().writeValueAsString(customResponse).getBytes());
                            return;
                        }
                        else {
                            logger.info("isUserAuthorized:{}", isUserAuthorized);
                            allowAccess = true;
                        }
                    } else {
                        logger.info("isAuthorizationNeeded : {}", properties.isAuthorizationNeeded());
                        allowAccess = true;
                    }
                }
            } catch (Exception e) {
                logger.error("Exception for validating user", e);
                allowAccess = false;
            }

            // Decide access
            if (!allowAccess) {
                ((HttpServletResponse) response).setStatus(HttpStatus.SC_UNAUTHORIZED);
                response.setContentType(MediaType.APPLICATION_JSON);
                CustomResponse<Response> customResponse = new CustomResponse<>();
                customResponse.setResponse(Collections.emptyList());
                VerifyUserResponse verifyUserResponse = (VerifyUserResponse) SessionMap.getValue(KEY_MAP_USER_AUTHORIZATION_INFO);
                assert verifyUserResponse != null;
                CustomError customError = new CustomError(verifyUserResponse.getStatusCode(), verifyUserResponse.getMessage(), org.springframework.http.HttpStatus.UNAUTHORIZED.getReasonPhrase());
                customResponse.setErrors(Collections.singletonList(customError));
                customResponse.setTraceId((String) SessionMap.getValue(KEY_MAP_TRACE_ID));
                response.getOutputStream().write(new ObjectMapper().writeValueAsString(customResponse).getBytes());
                logger.error("Access Restricted ****");
            } else {
                logger.debug("Access Allowed");
                chain.doFilter(request, response);
            }
        }
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, arg0.getServletContext());
    }*/
}