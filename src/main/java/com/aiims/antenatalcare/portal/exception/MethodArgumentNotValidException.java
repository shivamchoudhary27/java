package com.aiims.antenatalcare.portal.exception;

import org.springframework.validation.Errors;

public class MethodArgumentNotValidException  extends RuntimeException{
    public MethodArgumentNotValidException(String message) {
        super(message);
    }

    public Errors getBindingResult() {
        return null;
    }
}
