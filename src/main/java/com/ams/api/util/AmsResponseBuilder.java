package com.ams.api.util;

import com.ams.api.model.CustomResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Collections;

@Component
public class AmsResponseBuilder<T> {

    private static final Logger logger = LoggerFactory.getLogger(ResponseBuilder.class);

    public CustomResponse<T> buildResponse(CustomResponse<T> response) {
        logger.info("Inside buildResponse method and Setting the response.");
        response.setErrors(Collections.emptyList());
        response.setTimeStamp(LocalDateTime.now().toString());
        response.setSuccess(true);

        return response;
    }

}
