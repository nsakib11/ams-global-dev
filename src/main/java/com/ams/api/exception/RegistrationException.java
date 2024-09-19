package com.ams.api.exception;

import com.ams.api.model.CustomError;

import java.util.List;

public class RegistrationException extends NGIBaseException {

	private static final long serialVersionUID = 619665828707923005L;

	public RegistrationException() {
		super();
	}

	public RegistrationException(List<CustomError> error) {
		super(error);
	}

	public RegistrationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public RegistrationException(String message, Throwable cause) {
		super(message, cause);
	}

	public RegistrationException(String message) {
		super(message);
	}

	public RegistrationException(Throwable cause) {
		super(cause);
	}
}