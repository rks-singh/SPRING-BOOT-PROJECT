package com.ravi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String port = environment.getProperty("server.port");
		return "Welcomt to Springboot Microservices!! (Server Port :: "+port+")";
	}

}
