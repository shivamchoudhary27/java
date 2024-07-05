package com.aiims.antenatalcare.portal.dto;

import org.springframework.http.HttpStatus;

public class ResponseDto {
	private HttpStatus status;
	private String message;
	private int code;
	private Object data;

	public ResponseDto(Object obj, String message, HttpStatus status) {
		this.data = obj;
		this.status = status;
		this.message = message;
		this.code = status.value();

	}

	public ResponseDto(Object obj, HttpStatus status) {
		this.data = obj;
		this.status = status;
		this.code = status.value();

	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
