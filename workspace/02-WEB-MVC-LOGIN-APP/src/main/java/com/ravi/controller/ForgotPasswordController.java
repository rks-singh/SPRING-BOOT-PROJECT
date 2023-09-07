package com.ravi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForgotPasswordController {
	
	@GetMapping("/forgot")
	public String forgotPasswordController(Model model) {
		
		return "forgot_password";
	}

}
