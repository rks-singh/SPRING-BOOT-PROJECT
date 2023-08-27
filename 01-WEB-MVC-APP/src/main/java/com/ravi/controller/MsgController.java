package com.ravi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
    public MsgController() {
        System.out.println("MsgController Constructor :: Executed");

    }
    @GetMapping("/welcome")
    public ModelAndView getWelcomeMsg() {
        ModelAndView mav = new ModelAndView();

        //setting data in key value format to access in view page
        mav.addObject("msg", "Welcome to fist Spring Web Mvc Project");

        // setting view page name
        mav.setViewName("index");

        // returning mav object to Ui
        return mav;
    }

    @GetMapping("/greet")
    public ModelAndView getGreetMsg() {
        ModelAndView mav = new ModelAndView();

        // setting data in key and value format and send to ui
        mav.addObject("msg", "all the best....!!");

        //setting view page name
        mav.setViewName("index");
        return mav;
    }
}
