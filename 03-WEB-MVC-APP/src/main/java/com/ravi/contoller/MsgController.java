package com.ravi.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MsgController {
    @GetMapping("/greet")
    public String greetMsg(@RequestParam("name") String name, Model model) {

        String msgText = "Good Morning ::"+name;
        model.addAttribute("msg", msgText);
        return "index";
    }

    @GetMapping("/enquiry")
    public String getInfo(@RequestParam("course") String course,
                          @RequestParam("trainer") String trainer, Model model) {

        String msgText = "Course :"+course+", Trainer is :"+trainer;
        model.addAttribute("msg", msgText);
        return "index";
    }
}
