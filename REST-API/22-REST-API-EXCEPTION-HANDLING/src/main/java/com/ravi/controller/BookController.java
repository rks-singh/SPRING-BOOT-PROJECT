package com.ravi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@GetMapping("/book")
	public ResponseEntity<String> getBookName() {
		String  msg = null;
		msg.length();
		return new ResponseEntity<String>("JAVA",HttpStatus.OK);
	}
}
