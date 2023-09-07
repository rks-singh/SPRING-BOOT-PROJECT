package com.ravi.controller;

import com.ravi.binding.UserBinding;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForgotPasswordController {

    @GetMapping("/forgotPassword")
    public String loadForgotPasswordForm(Model model) {
        model.addAttribute("user", new UserBinding());
        return "forgot_password";
    }
}
