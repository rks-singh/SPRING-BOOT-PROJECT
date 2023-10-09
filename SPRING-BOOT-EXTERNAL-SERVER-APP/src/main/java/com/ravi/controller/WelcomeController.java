package com.ravi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String getWelcomeMessage() {
        return "Welcome to Spring Boot tutorial";
    }
}
