package com.aiims.antenatalcare.portal.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -2482244013574818034L;

	public ResourceNotFoundException(String message) {
		super(message);
	}

}
