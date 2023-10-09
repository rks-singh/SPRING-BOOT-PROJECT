package com.ravi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class DemoController {
    @GetMapping("/welcome")
    public String welcomeMsg(Model model){
        model.addAttribute("msg", "Welcome to Spring Boot.");
        int i = 10/0;
        return "index";
    }

    // local Exception Handling. specific to controller.
    @ExceptionHandler(value = Exception.class)
    public String handleException(Exception ex, Model model) {
        model.addAttribute("expRes", ex.getMessage());
        model.addAttribute("date", LocalDateTime.now());
        return "error";
    }


}
