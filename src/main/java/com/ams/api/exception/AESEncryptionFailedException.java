package com.ams.api.exception;

import com.ams.api.model.CustomError;
import org.springframework.http.HttpStatus;

import java.util.Collections;
import java.util.List;

import static com.ams.api.util.GlobalConstant.AES_ENCRYPTION_FAILED_CODE;
import static com.ams.api.util.GlobalConstant.AES_ENCRYPTION_FAILED_MESSAGE;

public class AESEncryptionFailedException extends NGIBaseException {

	private static final long serialVersionUID = -8276134391030131304L;

	public AESEncryptionFailedException() {
		super();
		CustomError error = new CustomError();
		error.setCode(AES_ENCRYPTION_FAILED_CODE).setMessage(AES_ENCRYPTION_FAILED_MESSAGE)
				.setType(HttpStatus.OK.getReasonPhrase());
		this.errors = Collections.singletonList(error);
	}

	public AESEncryptionFailedException(List<CustomError> error) {
		super(error);
	}

	public AESEncryptionFailedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public AESEncryptionFailedException(String message, Throwable cause) {
		super(message, cause);
	}

	public AESEncryptionFailedException(String message) {
		super(message);
	}

	public AESEncryptionFailedException(Throwable cause) {
		super(cause);
	}

}
