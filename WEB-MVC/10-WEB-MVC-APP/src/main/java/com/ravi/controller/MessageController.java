package com.ravi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {

    @GetMapping("/welcome")
    public String getWelcomeMessage(Model model) {
        model.addAttribute("msg", "Welcome Ravi Singh. !!!");
        return "index";
    }

    @ResponseBody
    @GetMapping("/greet")
    public String getGreetMessage() {
        return "Good Morning. !!!";
    }
}
