package com.ravi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController{
	
	@GetMapping("/test1")
	public String getUserName(Model model, HttpServletRequest req) {
		String name = req.getParameter("name");
		System.out.println("Name ::"+name);
		model.addAttribute("name",name);
		HttpSession session = req.getSession();
		session.setAttribute("name", name);
		return "index";
	}
	
	@GetMapping("/test2")
	public String modeifyUserName(Model model, HttpServletRequest req) {
		HttpSession session = req.getSession();
		String name = (String) session.getAttribute("name");
		model.addAttribute("name","My name is "+name);
		return "index";
	}
	
	@GetMapping("/logout")
	public String logOut(HttpServletRequest req, Model model) {
		HttpSession session = req.getSession();
		String name =(String) session.getAttribute("name");
		session.invalidate();
		model.addAttribute("name",name+" Logout from Session.. !!");
		return "index";
	}


}
