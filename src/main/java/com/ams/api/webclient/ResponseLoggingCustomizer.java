/*
package com.oracle.fcr.ngi.webclient;

import com.oracle.fcr.ngi.audit.entity.InterfaceLog;
import com.oracle.fcr.ngi.exception.GlobalException;
import com.oracle.fcr.ngi.service.InterfaceLogService;
import com.oracle.fcr.ngi.service.impl.InterfaceLogServiceImpl;
import com.oracle.fcr.ngi.util.SessionMap;
import lombok.SneakyThrows;
import org.json.JSONObject;
import org.reactivestreams.Publisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.web.reactive.function.client.WebClientCustomizer;
import org.springframework.cloud.sleuth.brave.instrument.messaging.ConditionalOnMessagingEnabled;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.client.reactive.ClientHttpRequest;
import org.springframework.http.client.reactive.ClientHttpRequestDecorator;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.client.ClientRequest;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import springfox.documentation.spring.web.json.Json;

import javax.naming.Context;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.oracle.fcr.ngi.util.GlobalConstant.*;

@Component
public class ResponseLoggingCustomizer  implements WebClientCustomizer  {
    @Value("${global.interfaceLog}")
    private Boolean isInterfaceLogEnabled;
    private static final Logger logger = LoggerFactory.getLogger(ResponseLoggingCustomizer.class);
    private InterfaceLog interfaceLog;
    @Autowired
    private InterfaceLogService interfaceLogService;
    @Override
    public void customize(WebClient.Builder webClientBuilder) {
        if (isInterfaceLogEnabled) {
            webClientBuilder
                    .filter(logFilter());
        }
    }

    private ExchangeFilterFunction logFilter() {
        interfaceLog = new InterfaceLog();
        return (clientRequest, next) -> {

            logger.info("***********Request: {} {}", clientRequest.method(), clientRequest.url());
            interfaceLog.setCreatedTime(LocalDateTime.now());
            interfaceLog.setCreatedBy(String.valueOf(SessionMap.getValue(KEY_MAP_USER_ID)));
            interfaceLog.setTransactionId(String.valueOf(SessionMap.getValue(KEY_MAP_TRANSACTION_ID)));
            interfaceLog.setId(String.valueOf(SessionMap.getValue(KEY_MAP_TRACE_ID)));
            interfaceLog.setRequestMethod(clientRequest.method().toString());
            interfaceLog.setRequestTime(LocalDateTime.now());
            logger.info("*********** Http Headers of Request: ***********");
            clientRequest.headers().forEach(this::logHeader);
            return next
                    .exchange(interceptBody(clientRequest))
                    .doOnNext(this::logResponse)
                    .map(this::interceptBody);
        };
    }
    private ClientRequest interceptBody(ClientRequest request) {
        return ClientRequest.from(request)
                .body((outputMessage, context) -> request.body().insert(new ClientHttpRequestDecorator(outputMessage) {
                    @Override public Mono<Void> writeWith(Publisher<? extends DataBuffer> body) {
                        return super.writeWith(Mono.from(body)
                                .doOnNext(dataBuffer -> logRequestBody(dataBuffer)));
                    }
                }, context))
                .build();
    }

    private ClientResponse interceptBody(ClientResponse response)  {
        return response.mutate()
                .body(data -> data.doOnNext(this::logResponseBody))
                .build();
    }
    private void logRequestBody(DataBuffer dataBuffer) {
        JSONObject jsonObject = new JSONObject(dataBuffer.toString(StandardCharsets.UTF_8));
        interfaceLog.setRequestJson(jsonObject.toString());
        logger.info("********* REQUEST: BODY: {}", jsonObject);
    }

    private void logResponse(ClientResponse response) {
        logger.info("DOWNSTREAM RESPONSE: STATUS: {}, HEADERS: {}", response.rawStatusCode(), response.headers().asHttpHeaders());
        interfaceLog.setResponseTime(LocalDateTime.now());
        interfaceLog.setStatusCode(String.valueOf(response.rawStatusCode()));
    }


    private void logResponseBody(DataBuffer dataBuffer)  {
        JSONObject jsonObject = new JSONObject(dataBuffer.toString(StandardCharsets.UTF_8));
        interfaceLog.setResponseJson(jsonObject.toString());
        logger.info("DOWNSTREAM RESPONSE: BODY: {}", jsonObject);
        System.out.println("#####################################################\n\n");
        System.out.println(interfaceLog);
        System.out.println("#####################################################\n\n");
//        try {
//            interfaceLogService.saveInterfaceLog(interfaceLog);
//        } catch (GlobalException e) {
//            throw new RuntimeException(e);
//        }

    }
    private void logHeader(String name, List<String> values) {
        values.forEach(value -> logger.info("{}={}", name, value));
    }
}
*/
