package com.ams.api.exception;

import com.ams.api.model.CustomError;
import org.springframework.http.HttpStatus;

import java.util.Collections;
import java.util.List;

import static com.ams.api.util.GlobalConstant.AES_DECRYPTION_FAILED_CODE;
import static com.ams.api.util.GlobalConstant.AES_DECRYPTION_FAILED_MESSAGE;

public class AESDecryptionFailedException extends NGIBaseException {

	private static final long serialVersionUID = 5883377044025921233L;

	public AESDecryptionFailedException() {
		super();
		CustomError error = new CustomError();
		error.setCode(AES_DECRYPTION_FAILED_CODE).setMessage(AES_DECRYPTION_FAILED_MESSAGE)
				.setType(HttpStatus.OK.getReasonPhrase());
		this.errors = Collections.singletonList(error);
	}

	public AESDecryptionFailedException(List<CustomError> error) {
		super(error);
	}

	public AESDecryptionFailedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public AESDecryptionFailedException(String message, Throwable cause) {
		super(message, cause);
	}

	public AESDecryptionFailedException(String message) {
		super(message);
	}

	public AESDecryptionFailedException(Throwable cause) {
		super(cause);
	}
}