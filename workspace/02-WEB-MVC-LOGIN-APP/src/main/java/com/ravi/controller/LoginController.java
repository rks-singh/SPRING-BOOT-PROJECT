package com.ravi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ravi.binding.UserBinding;
import com.ravi.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String loadLoginPage(Model model) {
		model.addAttribute("userBinding", new UserBinding());
		return "login";
	}

	/**
	 * 
	 * @param user
	 * @param model
	 * @return
	 */

	@PostMapping("/loginSuc")
	public String loginController(UserBinding user, Model model) {

		String userEmail = userService.getUserEmail(user.getEmail());
		String userPassword = userService.getUserPassword(user.getPassword());

		if (userEmail == null && userPassword == null) {
			System.out.println(user);
			model.addAttribute("msg", "No. info found, SignUp yourself !!");
		}
		return "login";
	}

}
