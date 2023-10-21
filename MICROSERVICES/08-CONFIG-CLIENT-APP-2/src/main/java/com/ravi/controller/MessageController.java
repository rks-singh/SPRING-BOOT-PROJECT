package com.ravi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MessageController {

	@Value("${msg}")
	private String msg;
	
	@GetMapping("/msg")
	public String getMessage() {
		return msg;
	}
}
