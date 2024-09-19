package com.ams.api.service.impl;

import com.ams.api.audit.entity.NgiAuditLog;
import com.ams.api.audit.repository.NgiAuditLogRepository;
//import com.ams.api.exception.GlobalException;
import com.ams.api.model.CustomResponse;
import com.ams.api.payload.request.AuditLogRequest;
import com.ams.api.service.AuditLogService;
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

//@Service
public class AuditLogServiceImpl /*implements AuditLogService*/ {
    /*private static final Logger LOGGER = LoggerFactory.getLogger(AuditLogServiceImpl.class);
    @Value("${log.rest-base-url}")
    private String logRestBaseUrl;
    @Autowired
    JmsTemplate jmsTemplate;
    @Value("${log.audit.designation-name}")
    private String jmsDesignation;

    @Value("${log.audit.type}")
    private String auditLogType;
    @Value("${spring.application.name}")
    private String applicationName;
    @Autowired
    private NgiAuditLogRepository manifestAuditLogRepository;
    @Autowired
    @Lazy
    private WebClient logApiClient;

    @Autowired
    private CircuitBreakerFactory circuitBreakerFactory;

    @Override
    public void saveAuditLog(NgiAuditLog auditLog) throws GlobalException {
        try {
            switch (auditLogType) {
                case GlobalConstant.AUDIT_LOG_TYPE_JMS:
                    try {
                        LOGGER.info("Sending Audit Log to ActiveMQ");
                        jmsTemplate.convertAndSend(jmsDesignation, auditLog);
                        LOGGER.info("Sent Audit Log to ActiveMQ");
                    }catch (Exception e){
                        e.printStackTrace();
                        sendAuditLogFallback(auditLog, e, "Audit Log sent to Jms failed.");
                    }
                    break;
                case GlobalConstant.AUDIT_LOG_TYPE_REST:
                    LOGGER.info("Sending Audit Log to REST");
                    CircuitBreaker circuitBreaker = circuitBreakerFactory.create(applicationName);
                    CustomResponse response = circuitBreaker.run(
                            () -> sendAuditLogToRest(auditLog),
                            throwable -> sendAuditLogFallback(auditLog, throwable, "Audit Log sent to REST failed.")
                    );
                    assert response != null;
                    if (response.isSuccess()) {
                        LOGGER.info("Audit Log sent to REST successfully");
                        LOGGER.info("Response from Audit Log REST : {}", response);
                    }
                    break;
                case GlobalConstant.AUDIT_LOG_TYPE_DATABASE:
                default:
                    LOGGER.info("Saving Audit Log in Global Service");
                    manifestAuditLogRepository.save(auditLog);
                    LOGGER.info("Saved Audit Log in Global Service");
                    break;
            }
        } catch (Exception e) {
            LOGGER.error("Error while saving audit log", e);
            throw new GlobalException("Error while saving audit log", e.getCause());
        }

    }

    private CustomResponse sendAuditLogToRest(NgiAuditLog auditLog) {
        CustomResponse response = logApiClient.post()
                .uri("/fcr/ngi/v1/audit-log")
                .body(Mono.just(new AuditLogRequest(auditLog)), AuditLogRequest.class)
                .retrieve()
                .bodyToMono(CustomResponse.class)
                .block();
        return response;
    }

    private CustomResponse sendAuditLogFallback(NgiAuditLog auditLog, Throwable throwable, String message) {
        LOGGER.error(message);
        throwable.printStackTrace();
        LOGGER.info("Inside the sendAuditLogToRestFallback() method");
        manifestAuditLogRepository.save(auditLog);
        LOGGER.info("Saved Audit Log in database.. inside sendAuditLogToRestFallback");
        return new CustomResponse<>();
    }*/
}

