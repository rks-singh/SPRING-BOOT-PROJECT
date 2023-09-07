package com.ravi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ravi.binding.UserBinding;

@Controller
public class RegisterController {

	@GetMapping("/loadReg")
	public String loadRegisterForm(Model model) {
//		model.addAttribute("userBinding", new UserBinding());
		return "register";
	}

	@PostMapping("/registerSuc")
	public String registerController(UserBinding user, Model model) {
		System.out.println(user);
		model.addAttribute("msg", "Registration Successful. !!");
		return "register";
	}

}
