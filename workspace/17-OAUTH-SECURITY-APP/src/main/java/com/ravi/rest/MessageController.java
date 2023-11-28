package com.ravi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@GetMapping("/")
	public String getMessage() {
		return "WELCOME TO SPRING SECURITY OAUTH2.0 APP!!";
	}
}
