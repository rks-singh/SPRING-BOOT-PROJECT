package com.ravi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.client.WelcomeApiClient;

@RestController
public class GreetController {
	
	@Autowired
	private WelcomeApiClient welcomeApiClient;
	
	@GetMapping("/greet")
	public String getGreetMSg() {
		
		String msg = "Good Morning";
		String welcomrResponse = welcomeApiClient.invokeWelcomeApi();
		
		return msg+", "+welcomrResponse;
	}
}
