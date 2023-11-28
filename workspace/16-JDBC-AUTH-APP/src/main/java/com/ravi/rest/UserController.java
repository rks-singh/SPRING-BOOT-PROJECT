package com.ravi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/admin")
	public String admin() {
		return "<h3> WELCOME ADMIN </h3>";
	}
	
	@GetMapping("/user")
	public String user() {
		return "<h3> WELCOME USER </h3>";
	}
	
	@GetMapping("/")
	public String message() {
		return "<h3>WELCOME ALL SPRINGBOOT DEVELOPER!!</h3>";
	}
}
