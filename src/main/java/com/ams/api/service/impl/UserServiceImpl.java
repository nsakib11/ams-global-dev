package com.ams.api.service.impl;

import com.ams.api.audit.entity.InterfaceLog;
//import com.ams.api.exception.GlobalException;
import com.ams.api.model.CustomError;
import com.ams.api.model.CustomResponse;
import com.ams.api.model.UserAuthorizationRequest;
import com.ams.api.payload.response.VerifyUserResponse;
import com.ams.api.service.InterfaceLogService;
import com.ams.api.service.UserService;
import com.ams.api.util.GlobalConstant;
import com.ams.api.util.SessionMap;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientRequestException;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.Collections;

//@Service
public class UserServiceImpl /*implements UserService*/ {
    /*private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private WebClient apiClient;
    @Autowired
    private InterfaceLogService interfaceLogService;

    @Value("${user-service.base-url}")
    private String userServiceBaseUrl;

    @Value("${spring.application.name}")
    private String applicationName;
    private InterfaceLog interfaceLog;
    private Long requestTimeInMillis = 0L;
    @Autowired
    private CircuitBreakerFactory circuitBreakerFactory;

    @Override
    public VerifyUserResponse verifyUser(String header, String uri) {
        UserAuthorizationRequest userAuthorizationRequest = new UserAuthorizationRequest();
        userAuthorizationRequest.setUrl(uri);
        interfaceLog = new InterfaceLog();
        interfaceLog.setRequestTime(LocalDateTime.now());
        interfaceLog.setRequestJson(new Gson().toJson(userAuthorizationRequest).getBytes());
        interfaceLog.setRequestMethod(HttpMethod.POST.toString());
        requestTimeInMillis = System.currentTimeMillis();

        VerifyUserResponse response = new VerifyUserResponse();
        org.springframework.cloud.client.circuitbreaker.CircuitBreaker circuitBreaker = circuitBreakerFactory.create(applicationName);
        CustomResponse responseFromApi = circuitBreaker.run(
                () -> apiClient.post()
                        .uri(userServiceBaseUrl + "/authorize-user")
                        .header("Authorization", header)
                        .body(Mono.just(userAuthorizationRequest), UserAuthorizationRequest.class)
                        .retrieve()
                        .bodyToMono(CustomResponse.class)
                        .block(),
                throwable -> {
                    try {
                        return isUserAuthorizedFallback(throwable);
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                }
        );
        LOGGER.info("Webclient response from User-service: {}", responseFromApi);
        if (responseFromApi != null && responseFromApi.isSuccess()) {
            response.setIsValidUser(true);
            response.setMessage(GlobalConstant.SUCCESS_MESSAGE);
            response.setStatusCode(GlobalConstant.SUCCESS_CODE);
        }else if (responseFromApi.getErrors() != null){
            CustomError customError = (CustomError) responseFromApi.getErrors().get(0);
            response.setIsValidUser(false);
            response.setMessage(customError.getMessage());
            response.setStatusCode(customError.getCode());
        }
        return response;
    }

    public CustomResponse isUserAuthorizedFallback(Throwable throwable) throws JsonProcessingException {
        LOGGER.info("********* inside isUserAuthorizedFallback Method **********");
        CustomError error;
        CustomResponse response = new CustomResponse<>();
        if (throwable.getClass().getSimpleName().equals("WebClientRequestException")) {
            WebClientRequestException requestException = (WebClientRequestException) throwable;
            error = new CustomError(GlobalConstant.SOMETHING_WRONG_ERROR_CODE, requestException.getCause().getMessage(), GlobalConstant.SOMETHING_WRONG_ERROR_TYPE);

            interfaceLog.setRequestMethod(requestException.getMethod().toString());
        } else {
            try {
                WebClientResponseException responseException = (WebClientResponseException) throwable;
                ObjectMapper mapper = new ObjectMapper();
                response = mapper.readValue(responseException.getResponseBodyAsString(), CustomResponse.class);
                if (response != null && response.getErrors() != null) {
                    error = (CustomError) response.getErrors().get(0);
                } else {
                    error = new CustomError(GlobalConstant.SOMETHING_WRONG_ERROR_CODE,
                            GlobalConstant.SOMETHING_WRONG_ERROR_MESSAGE, GlobalConstant.SOMETHING_WRONG_ERROR_TYPE);
                }
            }catch (Throwable throwable1){
                error = new CustomError(GlobalConstant.SOMETHING_WRONG_ERROR_CODE,
                    throwable.getMessage(), GlobalConstant.SOMETHING_WRONG_ERROR_TYPE);
            }

        }
        assert response != null;
        response.setErrors(Collections.singletonList(error));
        response.setSuccess(false);
        interfaceLog.setStatusCode(String.valueOf(HttpStatus.SC_SERVICE_UNAVAILABLE));
        interfaceLog.setResponseTime(LocalDateTime.now());
        interfaceLog.setProcessTime(System.currentTimeMillis() - requestTimeInMillis);
        interfaceLog.setResponseJson(new Gson().toJson(response).getBytes());
        interfaceLog.setConnectString(userServiceBaseUrl + "/authorize-user");
        interfaceLog.setDestinationSystem(applicationName);
        interfaceLog.setTransactionId(String.valueOf(SessionMap.getValue(GlobalConstant.KEY_MAP_TRANSACTION_ID)));
        interfaceLog.setId(String.valueOf(SessionMap.getValue(GlobalConstant.KEY_MAP_TRACE_ID)));
        interfaceLog.setCreatedBy(String.valueOf(SessionMap.getValue(GlobalConstant.KEY_MAP_USER_ID)));
        interfaceLog.setCreatedTime(LocalDateTime.now());
        try {
            interfaceLogService.saveInterfaceLog(interfaceLog);
        } catch (GlobalException e) {
            e.printStackTrace();
        }
        return response;
    }*/

}
