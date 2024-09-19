package com.ams.api.exception;

import com.ams.api.model.CustomError;

import java.util.Collections;

public final class ExceptionManager {

    public static void throwGlobalException(String code, String message, String type) throws GlobalException {
        CustomError error = new CustomError( code, message, type);
        throw new GlobalException(Collections.singletonList(error));
    }

    public static void throwNGISQLException(String code, String message, String type) throws NGISQLException {
        CustomError error = new CustomError( code, message, type);
        throw new NGISQLException(Collections.singletonList(error));
    }
    public static void throwNGISQLException(CustomError error) throws NGISQLException {
        throw new NGISQLException(Collections.singletonList(error));
    }

}
