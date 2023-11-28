package com.ravi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/message")
	public String getWelcomeMassge() {
		return "WELCOME TO SPRING BOOT ACTUATOR APP!!";
	}
}
