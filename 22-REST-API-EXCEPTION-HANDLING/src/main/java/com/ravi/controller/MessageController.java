package com.ravi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@GetMapping("msg")
	public ResponseEntity<String> getMessage() {

		int x = 10 / 0;
		return new ResponseEntity<String>("Hello Welcome",HttpStatus.OK);
	}
	
    // Local Exception Handling specific to MessageController class only.
	
	/**
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ExceptionInfo> exceptionHandler(Exception ex) {

		ExceptionInfo info = new ExceptionInfo("EX001", ex.getMessage(), LocalDate.now());
		return new ResponseEntity<>(info, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	**/

}
