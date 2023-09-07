package com.ravi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuoteController {

    @GetMapping("/quote")
    public String displayQuote(Model model) {
        model.addAttribute("msg", "There is no shortcut for Success. !!");

        String str = null;
        int length = str.length();
        return "index";
    }
}
