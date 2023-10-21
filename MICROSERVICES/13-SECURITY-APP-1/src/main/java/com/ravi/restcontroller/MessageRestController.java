package com.ravi.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {
	
	@GetMapping("/welcome")
	public String getWelcomeMessage() {
		return "Hello Welcome to first Spring Security App.";
	}
	
	@GetMapping("/greet")
	public String getGreetMessage() {
		return "Good Morning";
	}
}
