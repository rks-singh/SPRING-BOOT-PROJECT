package com.ravi.controller;

import com.ravi.binding.UserBinding;
import com.ravi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    @GetMapping("/reg")
    public String loadRegisterFrom(Model model) {
        model.addAttribute("user", new UserBinding());
        return "register";
    }

    @PostMapping("/regSuc")
    public String registerController(UserBinding userBinding, Model model) {
        userService.saveUser(userBinding);
        System.out.println(userBinding);
        return "redirect:/registerSuc";
    }

    @GetMapping("/registerSuc")
    public String registerSuc(Model model) {
        model.addAttribute("msg", "Registration Successful !!");
        model.addAttribute("user", new UserBinding());
        return "login";
    }

}
