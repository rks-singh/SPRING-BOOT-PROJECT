package com.ravi.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CourseController {

    @GetMapping("/course/{course}/info")
    public String getCourseInfo(@PathVariable("course") String course, Model model) {

        String msgText = course + ", course starts from next week..!!";
        model.addAttribute("msg", msgText);
        return "index";
    }
}
