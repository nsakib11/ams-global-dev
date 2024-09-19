package com.ams.api.exception;

import com.ams.api.model.CustomError;

import java.util.List;

public class CustomerInquiryException extends NGIBaseException {

	private static final long serialVersionUID = 619665828707923005L;

	public CustomerInquiryException() {
		super();
	}

	public CustomerInquiryException(List<CustomError> error) {
		super(error);
	}

	public CustomerInquiryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CustomerInquiryException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomerInquiryException(String message) {
		super(message);
	}

	public CustomerInquiryException(Throwable cause) {
		super(cause);
	}
}