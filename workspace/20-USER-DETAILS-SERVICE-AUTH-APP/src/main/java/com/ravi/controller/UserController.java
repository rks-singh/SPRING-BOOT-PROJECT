package com.ravi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.ravi.entity.User;
import com.ravi.service.IUserService;

@Controller
public class UserController {

	@Autowired
	private IUserService userService;

	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("user", new User());
		return "registerUser";
	}

	@GetMapping("/saveUser")
	public String saveUser(@ModelAttribute User user, Model model) {

		Integer id = userService.saveUser(user);
		String msg = "User " + id + " saved Successfully !";
		model.addAttribute("msg", msg);
		return "registerUser";
	}
}
