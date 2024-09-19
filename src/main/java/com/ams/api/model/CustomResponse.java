package com.ams.api.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.ams.api.util.SessionMap;

import static com.ams.api.util.GlobalConstant.*;
import static com.ams.api.util.GlobalConstant.KEY_MAP_SVC_RQ_ID;

@JsonInclude(Include.NON_NULL)
public class CustomResponse<T extends Object> {

    private List<T> response;
    private List<CustomError> errors;
    private boolean isSuccess;
    private String traceId;
    private String timeStamp;
    private String channelId;
    private String svcCode;
    private String svcRqId;
    public CustomResponse() {
        response = new ArrayList<>();
        errors = new ArrayList<>();
        this.traceId = (String) SessionMap.getValue(KEY_MAP_TRACE_ID);
        this.channelId = (String) SessionMap.getValue(KEY_MAP_CHANNEL_ID);
        this.svcCode = (String) SessionMap.getValue(KEY_MAP_SVC_CODE);
        this.svcRqId = (String) SessionMap.getValue(KEY_MAP_SVC_RQ_ID);
    }

    public CustomResponse(List<T> response, List<CustomError> errors, boolean isSuccess, String traceId,
                          String timeStamp) {
        super();
        this.response = response;
        this.errors = errors;
        this.isSuccess = isSuccess;
        this.traceId = traceId;
        this.timeStamp = timeStamp;
    }

    /**
     * @return the response
     */
    public List<T> getResponse() {
        return response;
    }

    /**
     * @param response the response to set
     */
    public void setResponse(List<T> response) {
        this.response = response;
    }

    /**
     * @return the errors
     */
    public List<CustomError> getErrors() {
        return errors;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    /**
     * @param errors the errors to set
     */
    public void setErrors(List<CustomError> errors) {
        this.errors = errors;
    }

    /**
     * @return the correlationId
     */
    public String getTraceId() {
        return traceId;
    }

    /**
     * @param traceId the correlationId to set
     */
    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    /**
     * @return the timeStamp
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * @param timeStamp the timeStamp to set
     */
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getSvcCode() {
        return svcCode;
    }

    public void setSvcCode(String svcCode) {
        this.svcCode = svcCode;
    }

    public String getSvcRqId() {
        return svcRqId;
    }

    public void setSvcRqId(String svcRqId) {
        this.svcRqId = svcRqId;
    }

    @Override
    public String toString() {
        final int maxLen = 10;
        return "CustomResponseBody [response="
                + (response != null ? response.subList(0, Math.min(response.size(), maxLen)) : null) + ", errors="
                + (errors != null ? errors.subList(0, Math.min(errors.size(), maxLen)) : null) + ", traceId="
                + traceId + ", timeStamp=" + timeStamp + ", channelId=" + channelId +  ", svcCode=" + svcCode
                + ", svcRqId=" + svcRqId + "]";
    }
}