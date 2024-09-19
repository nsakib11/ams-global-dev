package com.ams.api.service.impl;

import com.ams.api.audit.entity.InterfaceLog;
import com.ams.api.audit.repository.InterfaceLogRepository;
//import com.ams.api.exception.GlobalException;
import com.ams.api.model.CustomResponse;
import com.ams.api.payload.request.InterfaceLogRequest;
import com.ams.api.service.InterfaceLogService;
import com.ams.api.util.GlobalConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.concurrent.atomic.AtomicReference;

//@Service
public class InterfaceLogServiceImpl /*implements InterfaceLogService*/ {
    /*private static final Logger LOGGER = LoggerFactory.getLogger(InterfaceLogServiceImpl.class);

    @Autowired
    @Lazy
    private WebClient logApiClient;

    @Value("${log.rest-base-url}")
    private String logRestBaseUrl;
    @Autowired
    JmsTemplate jmsTemplate;
    @Value("${log.interface.designation-name}")
    private String jmsDesignation;

    @Value("${log.interface.type}")
    private String interfaceLogType;

    @Autowired
    private InterfaceLogRepository interfaceLogRepository;
    @Autowired
    private CircuitBreakerFactory circuitBreakerFactory;

    @Override
    public void saveInterfaceLog(InterfaceLog interfaceLog) throws GlobalException {
        try {
            switch (interfaceLogType) {
                case GlobalConstant.INTERFACE_LOG_TYPE_JMS:
                    LOGGER.info("Send Interface Log to ActiveMQ");
                    jmsTemplate.convertAndSend(jmsDesignation, interfaceLog);
                    break;
                case GlobalConstant.INTERFACE_LOG_TYPE_REST:
                    LOGGER.info("Send Interface Log to REST");
                    CircuitBreaker circuitBreaker = circuitBreakerFactory.create("${spring.application.name}");
                    circuitBreaker.run(
                            () -> sendLogToRest(interfaceLog),
                            throwable -> sendLogToRestFallback(interfaceLog, throwable));
                    break;
                case GlobalConstant.INTERFACE_LOG_TYPE_DATABASE:
                    LOGGER.info("Saving Interface Log in Database");
                    interfaceLogRepository.save(interfaceLog);
                    LOGGER.info("Saved Interface Log in Database");
                    break;

                default:
                    throw new GlobalException("Invalid interface log type");
            }
        } catch (Exception e) {
            LOGGER.error("Error while saving interface log", e);
            throw new GlobalException("Error while saving interface log", e.getCause());
        }
    }

    private Boolean sendLogToRest(InterfaceLog interfaceLog) {
        AtomicReference<Boolean> flag = new AtomicReference<>(false);
        CustomResponse response = logApiClient.post()
                .uri("/fcr/ngi/v1/interface-log")
                .body(Mono.just(new InterfaceLogRequest(interfaceLog)), InterfaceLogRequest.class)
                .retrieve()
                .bodyToFlux(CustomResponse.class).blockFirst();
        if (response != null && response.isSuccess()){
            LOGGER.info("Interface Log sent to REST successfully");
            LOGGER.info("Response from Interface Log REST : {}", response);
        }
        return flag.get();
    }
    private Boolean sendLogToRestFallback(InterfaceLog interfaceLog, Throwable throwable){
        throwable.printStackTrace();
        LOGGER.info("******* Inside the sendLogToRestFallback");
        LOGGER.info("Saving Interface Log to Database");
        interfaceLogRepository.save(interfaceLog);
        LOGGER.info("Saved Interface Log to Database");
        return true;
    }*/
}

