package com.ravi.controller;

import com.ravi.binding.User;
import com.ravi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String loadUserForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }
    // PRG Pattern ==> Post-Redirect-Get Pattern ==> Solve double posting problem.
    @PostMapping("/loginSuc")
    public String userController(User user, Model model) {
        System.out.println(user);
        userService.saveUser(user);
        int userId = userService.getUserId(user.getName());
        model.addAttribute("msg", "Registration Successful with User Id :"+userId);
        return "redirect:/userAccCreationSuc";
    }

    @GetMapping("/userAccCreationSuc")
    public String userAccCreationSuc(Model model) {
        model.addAttribute("user", new User());
        System.out.println("UserAccCreation Method called.");
        return "login";
    }
}
