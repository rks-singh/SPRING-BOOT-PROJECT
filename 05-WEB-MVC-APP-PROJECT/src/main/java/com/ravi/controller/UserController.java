package com.ravi.controller;

import com.ravi.binding.User;
import com.ravi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/")
    public String loadForm(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/user")
    public String handelFormSubmit(User user, Model model) {
        if (user != null) {
            userRepository.save(user);
            model.addAttribute("msg","User data saved Successfully...!!");
        }else {
            model.addAttribute("msg","User data not saved...!!");
        }
        return "index";
    }

    @GetMapping("/view")
    public String viewUser(Model model) {
        List<User> users = userRepository.findAll();
        if (!users.isEmpty()) {
            model.addAttribute("users",users);
        }else {
            model.addAttribute("msg", "User table is Empty...!!");
        }
        return "view-user";
    }
}
