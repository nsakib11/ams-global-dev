package com.ams.api.exception;

import com.ams.api.model.CustomError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TokenInvalidException extends Exception {

    private static final long serialVersionUID = 1L;
    List<CustomError> errors;

    public TokenInvalidException() {
        super();
        errors = new ArrayList<>();
    }

    public TokenInvalidException(List<CustomError> errors) {
        super();
        this.errors = errors;
    }

    public TokenInvalidException(List<CustomError> errors, String message) {
        super(message);
        this.errors = errors;
    }

    public TokenInvalidException(String message, Throwable cause, boolean enableSuppression,
                                 boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public TokenInvalidException(String message, Throwable cause) {
        super(message, cause);
    }

    public TokenInvalidException(String message) {
        super(message);
    }

    public TokenInvalidException(Throwable cause) {
        super(cause);
    }

    public List<CustomError> getErrors() {
        return errors;
    }

    public void setErrors(List<CustomError> errors) {
        this.errors = errors;
    }
}
