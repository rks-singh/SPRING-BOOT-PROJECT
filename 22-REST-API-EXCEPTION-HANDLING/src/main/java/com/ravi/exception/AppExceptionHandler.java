package com.ravi.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {

	// Global Exception Handling Specific to application, Handle all exception occur
	// in Application.

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ExceptionInfo> exceptionHandler(Exception ex) {

		ExceptionInfo info = new ExceptionInfo("Ex001", ex.getMessage(), LocalDate.now());
		return new ResponseEntity<ExceptionInfo>(info, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity<ExceptionInfo> handleProductNotFoundException(ProductNotFoundException ex){
		
		ExceptionInfo info = new ExceptionInfo("Ex002",ex.getMessage(),LocalDate.now());
		return new ResponseEntity<ExceptionInfo>(info,HttpStatus.BAD_REQUEST);
	}

}
