package com.ravi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.client.WelcomeApiClient;

@RestController
public class GreetController {

	@Autowired
	private WelcomeApiClient welcomeApi;
	
	@GetMapping("greet")
	public String getGreetMessage() {
		String str = "GOOD MORNING";
		String msg = welcomeApi.invokeWelcomeApi();
		return str +", "+msg;
	}
}
