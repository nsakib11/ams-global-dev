package com.ams.api.exception;

import com.ams.api.model.CustomError;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NGIBaseException extends Exception {

    List<CustomError> errors;

    private static final long serialVersionUID = 1L;

    public NGIBaseException() {
        super();
        errors = new ArrayList<>();
    }

    public NGIBaseException(List<CustomError> errors) {
        super(errors.stream().map(CustomError::getMessage).collect(Collectors.toList()).toString());
        this.errors = errors;
    }


    public NGIBaseException(String message, Throwable cause, boolean enableSuppression,
                            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public NGIBaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public NGIBaseException(String message) {
        super(message);
    }

    public NGIBaseException(Throwable cause) {
        super(cause);
    }

    public List<CustomError> getErrors() {
        return errors;
    }

    public void setErrors(List<CustomError> errors) {
        this.errors = errors;
    }
}