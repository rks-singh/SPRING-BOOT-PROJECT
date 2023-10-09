package com.ravi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

    public BookController() {
        System.out.println("BookController Constructor :: Executed");
    }
    @GetMapping("/book")
    public ModelAndView getBookDetails() {
        ModelAndView mav = new ModelAndView();

        // setting data in key value format and send to ui.
        mav.addObject("id", 101);
        mav.addObject("name", "Java");
        mav.addObject("price", 123.45);

        //setting view page name where data to be rendered.
        mav.setViewName("book");
        return mav;
    }

}
