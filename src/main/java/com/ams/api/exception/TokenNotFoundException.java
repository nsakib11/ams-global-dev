package com.ams.api.exception;

import com.ams.api.model.CustomError;
import com.ams.api.util.GlobalConstant;

import java.util.Collections;

public class TokenNotFoundException extends NGIBaseException {


    private static final long serialVersionUID = 1L;

    public TokenNotFoundException(String message) {
        super(Collections.singletonList(new CustomError(GlobalConstant.TOKEN_NOT_FOUND_ERROR_CODE, message,
                GlobalConstant.TOKEN_NOT_FOUND_ERROR_TYPE)));
    }
}
