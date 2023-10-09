package com.ravi.controller;

import com.ravi.binding.UserBinding;
import com.ravi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.Objects;


@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String loadLoginForm(Model model) {
        model.addAttribute("user", new UserBinding());
        return "login";
    }

    @PostMapping("/loginSuc")
    public String loginController(UserBinding userBinding, Model model) {

        System.out.println(userBinding);
        String userEmail = userService.getUserEmail(userBinding.getEmail());
        String userPassword = userService.getUserPassword(userBinding.getPassword());
        String userName = userService.getUserName(userEmail);

        if (userEmail == null && userPassword == null) {
            return "redirect:/userLoginUnSuc";

        } else if ((Objects.equals(userEmail, userBinding.getEmail())) && (Objects.equals(userPassword, userBinding.getPassword()))) {

            System.out.println("UserEMail :" + userEmail);
            System.out.println("UserBindingEMail :" + userBinding.getEmail());
            System.out.println("UserPass :" + userPassword);
            System.out.println("UserBindingPass :" + userPassword);
            model.addAttribute("name", userName);
            return "dashboard";
        } else {
            return "redirect:/invalid";
        }

    }

    @GetMapping("/invalid")
    public String userLoginSuc(Model model) {
        model.addAttribute("msg", "Login unsuccessful, Invalid Password. !!");
        model.addAttribute("user", new UserBinding());
        return "login";
    }

    @GetMapping("/userLoginUnSuc")
    public String userLoginUnSuc(Model model) {
        model.addAttribute("msg", "You don't have an account, SignUp yourself !!");
        model.addAttribute("user", new UserBinding());
        return "login";
    }


}
