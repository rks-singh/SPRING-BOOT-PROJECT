package com.ravi.controler;

import com.ravi.binding.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/name")
    public ModelAndView getUserName() {
        ModelAndView mav = new ModelAndView();

        //setting the data
        mav.addObject("data", "Ravi Singh");

        //setting view name
        mav.setViewName("index");
        return mav;
    }

    @GetMapping("/email")
    public String getUserEmail(Model model) {
        model.addAttribute("data", "ravi@gmail.com");
        return "index";
    }

    @GetMapping("/user")
    public String getUserDetails(Model model) {
        User userObj = new User(101,"Ravi Singh","ravi@gmail.com");
        model.addAttribute("user", userObj);
        return "user_details";
    }

    @GetMapping("/users")
    public String getUsers(Model model) {
        User u1 = new User(101, "Ravi", "ravi@gmail.com");
        User u2 = new User(102, "Sohan", "sohan@gmail.com");
        User u3 = new User(103,"Mohan","mohan@gmail.com");

        List<User> userList = Arrays.asList(u1,u2,u3);
        model.addAttribute("usersList", userList);
        return "view_users";
    }
}
