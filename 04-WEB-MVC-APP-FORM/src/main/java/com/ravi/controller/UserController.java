package com.ravi.controller;

import com.ravi.binding.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    // to load empty form
    @GetMapping("/")
    public String loadForm(Model model) {

        model.addAttribute("user", new User());
        return "index";
    }

    // to handle form submission.
    @PostMapping("/user")
    public String handleSubmitBtn(User user, Model model) {
        System.out.println(user);
        model.addAttribute("msg", "User data saved successfully..!!");
        return "success";
    }
}
