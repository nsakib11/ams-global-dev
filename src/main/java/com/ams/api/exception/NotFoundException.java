package com.ams.api.exception;



import com.ams.api.model.CustomError;
import com.ams.api.util.GlobalConstant;

import java.util.Collections;

public class NotFoundException extends NGIBaseException {

	private static final long serialVersionUID = 1L;

	public NotFoundException(String message) {
		super(Collections.singletonList(new CustomError(GlobalConstant.NOT_FOUND_ERROR_CODE, message,
				GlobalConstant.NOT_FOUND_ERROR_TYPE)));
	}
}
