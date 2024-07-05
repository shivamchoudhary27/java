package com.aiims.antenatalcare.portal.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import com.aiims.antenatalcare.portal.dto.ExceptionResponse;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalAPIExceptionHandler {

	
	@ExceptionHandler(Exception.class)
	public String handleException(Exception e, Model model, HttpServletRequest request) {
		model.addAttribute("message", "some error ocuured");

		System.out.println(e.getMessage());
		System.out.println("hi");
		String referer = request.getHeader("Referer");

		System.out.println(referer);
		// Redirect back to the referring page
		return "redirect:" + referer;
	}
	 	 

	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ResponseEntity<String> handleResourceNotFoundException(ResourceNotFoundException exception) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
	}

	@ExceptionHandler(DateException.class)
	public ResponseEntity<ErrorsDetails> handleDateException(DateException exception, WebRequest webRequest) {
		ErrorsDetails errorDetails = new ErrorsDetails();
		errorDetails.setTimestamp(LocalDateTime.now());
		errorDetails.setMessage(exception.getMessage());
		errorDetails.setPath(webRequest.getDescription(false));
		errorDetails.setErrorCode("DATE_EXCEPTION_OCCUR");

		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(EmailAlreadyExists.class)
	public ResponseEntity<ErrorsDetails> handleEmailException(EmailAlreadyExists exception, Model model,
			WebRequest webRequest) {
		ErrorsDetails errorDetails = new ErrorsDetails();
		errorDetails.setTimestamp(LocalDateTime.now());
		errorDetails.setMessage(exception.getMessage());
		errorDetails.setPath(webRequest.getDescription(false));
		errorDetails.setErrorCode("EMAIL_EXCEPTION_OCCUR");
		model.addAttribute("errorMessage", exception.getMessage());
		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(NoSuchElementException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public @ResponseBody ExceptionResponse handleEmployeeNotFound(NoSuchElementException exception,
			final HttpServletRequest request) {
		ExceptionResponse error = new ExceptionResponse();
		error.setErrorMessage(exception.getMessage());
		error.setRequestedURI(request.getRequestURI());
		error.setErrorCode(HttpStatus.NOT_FOUND.toString());

		return error;
	}

	@ExceptionHandler(AuthenticationException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public @ResponseBody ExceptionResponse handleEmployeeNotFound(AuthenticationException exception,
			final HttpServletRequest request) {
		ExceptionResponse error = new ExceptionResponse();
		error.setErrorMessage(exception.getMessage());
		error.setRequestedURI(request.getRequestURI());
		error.setErrorCode(HttpStatus.BAD_REQUEST.toString());

		return error;
	}
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
		Map<String, String> errors = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error) -> {
			String fieldName = ((FieldError) error).getField();
			String errorMessage = error.getDefaultMessage();
			errors.put(fieldName, errorMessage);
		});
		return errors;
	}
}
