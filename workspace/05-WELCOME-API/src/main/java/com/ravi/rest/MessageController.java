package com.ravi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@Autowired
	private Environment env;
	
	@GetMapping("/message")
	public String getMessage() {
		String port = env.getProperty("server.port");
		return "WELCOME TO FIRST MICROSERVICES APP!! (SERVER PORST :: "+port+")";
	}
}
