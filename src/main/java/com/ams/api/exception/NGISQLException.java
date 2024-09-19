package com.ams.api.exception;

import com.ams.api.model.CustomError;

import java.util.List;

public class NGISQLException extends NGIBaseException {

    private static final long serialVersionUID = 1L;

    public NGISQLException() {
        super();
    }

    public NGISQLException(List<CustomError> error) {
        super(error);
    }

    public NGISQLException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public NGISQLException(String message, Throwable cause) {
        super(message, cause);
    }

    public NGISQLException(String message) {
        super(message);
    }

    public NGISQLException(Throwable cause) {
        super(cause);
    }

}
