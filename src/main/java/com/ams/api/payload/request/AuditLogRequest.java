package com.ams.api.payload.request;

import com.ams.api.audit.entity.NgiAuditLog;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class AuditLogRequest implements Serializable {
    /*private String traceId;
    private String url;
    private String httpMethod;
    private String client;
    private String httpHeader;
    private String queryString;
    private String request;
    private String response;
    private String responseStatus;
    private String requestUserId;
    private String containerId;
    private long processTime;
    private Timestamp requestTime;
    private String comments;
    private Timestamp processingEndTime;
    private Timestamp processingStartTime;
    private Timestamp insertTime;
    private String transactionId;
    private String refTxnNo;
    private String channelId;
    private String svcCode;
    private String svcRqId;
    private String txnDate;

    private String serviceName;
    private String httpStatusCode;


    public NgiAuditLog toEntity() {
        NgiAuditLog ngiAuditLog = new NgiAuditLog();
        ngiAuditLog.setTraceId(this.traceId);
        ngiAuditLog.setUrl(this.url);
        ngiAuditLog.setHttpMethod(this.httpMethod);
        ngiAuditLog.setClient(this.client);
        ngiAuditLog.setHttpHeader(this.httpHeader);
        ngiAuditLog.setQueryString(this.queryString);
        ngiAuditLog.setRequest(this.request.getBytes());
        ngiAuditLog.setResponse(this.response.getBytes());
        ngiAuditLog.setResponseStatus(this.responseStatus);
        ngiAuditLog.setRequestUserId(this.requestUserId);
        ngiAuditLog.setContainerId(this.containerId);
        ngiAuditLog.setProcessTime(this.processTime);
        ngiAuditLog.setRequestTime(this.requestTime);
        ngiAuditLog.setComments(this.comments);
        ngiAuditLog.setProcessingEndTime(this.processingEndTime);
        ngiAuditLog.setProcessingStartTime(this.processingStartTime);
        ngiAuditLog.setInsertTime(this.insertTime);
        ngiAuditLog.setTransactionId(this.transactionId);
        ngiAuditLog.setRefTxnNo(this.refTxnNo);
        ngiAuditLog.setServiceName(this.serviceName);
        ngiAuditLog.setHttpStatusCode(this.httpStatusCode);
        return ngiAuditLog;
    }

    public AuditLogRequest(NgiAuditLog ngiAuditLog) {
        this.traceId = ngiAuditLog.getTraceId();
        this.url = ngiAuditLog.getUrl();
        this.httpMethod = ngiAuditLog.getHttpMethod();
        this.client = ngiAuditLog.getClient();
        this.httpHeader = ngiAuditLog.getHttpHeader();
        this.queryString = ngiAuditLog.getQueryString();
        this.request = new String(ngiAuditLog.getRequest());
        this.response = new String(ngiAuditLog.getResponse());
        this.responseStatus = ngiAuditLog.getResponseStatus();
        this.requestUserId = ngiAuditLog.getRequestUserId();
        this.containerId = ngiAuditLog.getContainerId();
        this.processTime = ngiAuditLog.getProcessTime();
        this.requestTime = ngiAuditLog.getRequestTime();
        this.comments = ngiAuditLog.getComments();
        this.processingEndTime = ngiAuditLog.getProcessingEndTime();
        this.processingStartTime = ngiAuditLog.getProcessingStartTime();
        this.insertTime = ngiAuditLog.getInsertTime();
        this.transactionId = ngiAuditLog.getTransactionId();
        this.refTxnNo = ngiAuditLog.getRefTxnNo();
        this.serviceName = ngiAuditLog.getServiceName();
        this.httpStatusCode = ngiAuditLog.getHttpStatusCode();
    }*/
}
