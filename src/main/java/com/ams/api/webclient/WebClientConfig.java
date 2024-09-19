package com.ams.api.webclient;

import com.ams.api.audit.entity.InterfaceLog;
//import com.ams.api.exception.GlobalException;
import com.ams.api.service.InterfaceLogService;
import com.ams.api.util.SessionMap;
import org.json.JSONObject;
import org.reactivestreams.Publisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.client.reactive.ClientHttpRequestDecorator;
import org.springframework.web.reactive.function.client.ClientRequest;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.List;

import static com.ams.api.util.GlobalConstant.*;

//@Configuration
public class WebClientConfig {
    /*@Value("${log.rest-base-url}")
    private String logRestBaseUrl;
    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${global.interfaceLog}")
    private Boolean isInterfaceLogEnabled;
    private static final Logger logger = LoggerFactory.getLogger(WebClientConfig.class);
    private InterfaceLog interfaceLog;
    @Autowired
    private InterfaceLogService interfaceLogService;
    private Long requestTimeInMillis= 0L;
    @Bean
    public WebClient apiClient(WebClient.Builder webClientBuilder) {
        if (isInterfaceLogEnabled) {
            webClientBuilder.filter(logFilter());
        }
        return webClientBuilder.build();
    }
    @Bean
    public WebClient logApiClient(WebClient.Builder webClientBuilder) {
        return webClientBuilder.baseUrl(logRestBaseUrl).build();
    }


    private ExchangeFilterFunction logFilter() {
        interfaceLog = new InterfaceLog();
        return (clientRequest, next) -> {

            logger.info("***********Request: {} {}", clientRequest.method(), clientRequest.url());
            interfaceLog.setConnectString(String.valueOf(clientRequest.url()));
            interfaceLog.setDestinationSystem(applicationName);
            interfaceLog.setCreatedTime(LocalDateTime.now());
            interfaceLog.setCreatedBy(String.valueOf(SessionMap.getValue(KEY_MAP_USER_ID)));
            interfaceLog.setTransactionId(String.valueOf(SessionMap.getValue(KEY_MAP_TRANSACTION_ID)));
            interfaceLog.setId(String.valueOf(SessionMap.getValue(KEY_MAP_TRACE_ID)));
            interfaceLog.setRequestMethod(clientRequest.method().toString());
            interfaceLog.setRequestTime(LocalDateTime.now());
            requestTimeInMillis = System.currentTimeMillis();

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
        interfaceLog.setRequestJson(jsonObject.toString().getBytes());
        logger.info("********* REQUEST: BODY: {}", jsonObject);
    }

    private void logResponse(ClientResponse response) {
        logger.info("DOWNSTREAM RESPONSE: STATUS: {}, HEADERS: {}", response.rawStatusCode(), response.headers().asHttpHeaders());
        interfaceLog.setResponseTime(LocalDateTime.now());
        interfaceLog.setProcessTime(System.currentTimeMillis() - requestTimeInMillis);
        interfaceLog.setStatusCode(String.valueOf(response.rawStatusCode()));

    }

    private void logResponseBody(DataBuffer dataBuffer)  {
        JSONObject jsonObject = new JSONObject(dataBuffer.toString(StandardCharsets.UTF_8));
        interfaceLog.setResponseJson(jsonObject.toString().getBytes());
        logger.info("DOWNSTREAM RESPONSE: BODY: {}", jsonObject);
        logger.info("\n\n#####################################################\n\n");
        logger.info("{}",interfaceLog);
        logger.info("\n\n#####################################################\n\n");

        try {
            interfaceLogService.saveInterfaceLog(interfaceLog);
        } catch (GlobalException e) {
            e.printStackTrace();
        }


    }
    private void logHeader(String name, List<String> values) {
        values.forEach(value -> logger.info("{}={}", name, value));
    }*/
}