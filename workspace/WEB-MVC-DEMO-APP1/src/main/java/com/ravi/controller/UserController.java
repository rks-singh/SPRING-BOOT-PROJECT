package com.ravi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ravi.model.User;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String loadUserForm(Model model) {
		model.addAttribute("user",new User());
		return "user";
	}
	
	@PostMapping("/user")
	public String saveUser(User user, Model model) {
		System.out.println(user);
		 return "redirect:/";
	}
	
}
