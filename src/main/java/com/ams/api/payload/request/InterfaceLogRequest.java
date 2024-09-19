package com.ams.api.payload.request;

import com.ams.api.audit.entity.InterfaceLog;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/*@Data
@AllArgsConstructor
@NoArgsConstructor*/
public class InterfaceLogRequest implements Serializable {
    /*private String id;
    private String transactionId;
    private String destinationSystem;
    private String connectString;
    private String requestMethod;
    private LocalDateTime requestTime;
    private String requestJson;
    private LocalDateTime responseTime;
    private String responseJson;
    private Long processTime;
    private String remark;
    private String statusCode;
    private LocalDateTime createdTime;
    private String createdBy;
    private LocalDateTime modifiedTime;
    private String modifiedBy;

    public InterfaceLogRequest(InterfaceLog interfaceLog) {
        this.id = interfaceLog.getId();
        this.transactionId = interfaceLog.getTransactionId();
        this.destinationSystem = interfaceLog.getDestinationSystem();
        this.connectString = interfaceLog.getConnectString();
        this.requestMethod = interfaceLog.getRequestMethod();
        this.requestTime = interfaceLog.getRequestTime();
        if (interfaceLog.getRequestJson() != null) {
            this.requestJson = new String(interfaceLog.getRequestJson());
        }
        this.responseTime = interfaceLog.getResponseTime();
        if (interfaceLog.getResponseJson() != null) {
            this.responseJson = new String(interfaceLog.getResponseJson());
        }
        this.processTime = interfaceLog.getProcessTime();
        this.remark = interfaceLog.getRemark();
        this.statusCode = interfaceLog.getStatusCode();
        this.createdTime = interfaceLog.getCreatedTime();
        this.createdBy = interfaceLog.getCreatedBy();
    }

    public InterfaceLog toEntity() {
        InterfaceLog interfaceLog = new InterfaceLog();
        interfaceLog.setId(this.id);
        interfaceLog.setTransactionId(this.transactionId);
        interfaceLog.setDestinationSystem(this.destinationSystem);
        interfaceLog.setConnectString(this.connectString);
        interfaceLog.setRequestMethod(this.requestMethod);
        interfaceLog.setRequestTime(this.requestTime);
        interfaceLog.setRequestJson(this.requestJson.getBytes());
        interfaceLog.setResponseTime(this.responseTime);
        interfaceLog.setResponseJson(this.responseJson.getBytes());
        interfaceLog.setProcessTime(this.processTime);
        interfaceLog.setRemark(this.remark);
        interfaceLog.setStatusCode(this.statusCode);
        interfaceLog.setCreatedTime(this.createdTime);
        interfaceLog.setCreatedBy(this.createdBy);
        return interfaceLog;
    }*/


}
