package com.ams.api.util;

import static com.ams.api.util.GlobalConstant.KEY_MAP_TRACE_ID;
import static com.ams.api.util.GlobalConstant.KEY_MAP_MODULE_ID;
import static com.ams.api.util.GlobalConstant.KEY_MAP_TRANSACTION_CODE;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import com.ams.api.model.CustomError;
import com.ams.api.model.CustomResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ResponseBuilder<T> {
    private static final Logger logger = LoggerFactory.getLogger(ResponseBuilder.class);
//    @Autowired
//    private NgiAuditLogRepository manifestAuditLogRepository;
    public CustomResponse<T> buildResponse(CustomResponse<T> response) {
        logger.info("Inside buildResponse method and Setting the response.");
        response.setErrors(Collections.emptyList());
        response.setTimeStamp(LocalDateTime.now().toString());
        response.setSuccess(true);

        return response;
    }

    public CustomResponse<T> buildResponse(List<CustomError> errors) {
        logger.info("(Error) Inside buildResponse method and Setting the error.");
        CustomResponse<T> response = null;

        try {
        	
//           String traceId = CommonUtils.generateTransactionId(manifestAuditLogRepository.getNextSeriesId());
            String traceId = "test-traceId";

            if (SessionMap.has(KEY_MAP_TRACE_ID)) {
            	traceId = SessionMap.getValue(KEY_MAP_TRACE_ID).toString();
            } else {
                if (SessionMap.has(KEY_MAP_MODULE_ID) && SessionMap.has(KEY_MAP_TRANSACTION_CODE)) {

//                	traceId = CommonUtils.generateTransactionId(
//                    		manifestAuditLogRepository.getNextSeriesId());
                }
            }

            response = new CustomResponse<>();
            response.setTraceId(traceId);
            response.setErrors(errors);
            response.setResponse(Collections.emptyList());
            response.setTimeStamp(LocalDateTime.now().toString());
            response.setSuccess(false);

            return response;
        } finally {
            response = null;
        }
    }

    public CustomResponse<T> buildResponse(List<T> payload, List<CustomError> errors, String correlationId,
                                           boolean success) {

        CustomResponse<T> response = new CustomResponse<>();
        response.setTraceId(correlationId);
        response.setErrors(errors);
        response.setResponse(payload);
        response.setTimeStamp(LocalDateTime.now().toString());

        response.setSuccess(success);

        return response;

    }
}