package com.ravi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@GetMapping("/message")
	public String getMessage() {
		return "WELCOME TO SPRING SECURITY APP!!";
	}
	
	@GetMapping("/greet")
	public String getGreetMessage() {
		return "GOOD MORNING. SPRINGBOOT DEVELOPER!!";
	}
}
