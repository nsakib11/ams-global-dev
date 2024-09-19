package com.ams.api.exception;

import com.ams.api.model.CustomError;

import java.util.List;

public class GLException extends NGIBaseException {

	private static final long serialVersionUID = 619665828707923005L;

	public GLException() {
		super();
	}

	public GLException(List<CustomError> error) {
		super(error);
	}

	public GLException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public GLException(String message, Throwable cause) {
		super(message, cause);
	}

	public GLException(String message) {
		super(message);
	}

	public GLException(Throwable cause) {
		super(cause);
	}
}