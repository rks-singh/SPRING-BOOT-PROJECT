package com.ravi.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageCongtroller {
	
	@GetMapping("/msg")
	public String getMessaage() {
		return "Welcome for Distributed application developemnt...";
	}
	
	@GetMapping("/greet")
	public String getGreetMessage() {
		return "Good Morning. !!!";
	}

}
