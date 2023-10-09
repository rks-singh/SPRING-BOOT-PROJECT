package com.ravi.controller;

import com.ravi.binding.User;
import com.ravi.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    // loading the form
    @GetMapping("/")
    public String loadForm(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }


    // getting the form data
    @PostMapping("/user")
    public String getFormData(@Valid User user,BindingResult result, Model model) {

        // @Valid ==> used to validate form data with form validation
        // BindingResult ==> It is used to verify whether form data are valid or not.

        if (result.hasErrors()) {
            return "index";
        }
        // inserting user data into database.
        boolean userRecord = userService.storeUserRecord(user);
        if (userRecord) {
            model.addAttribute("msg","User record saved successfully.. !!");
        }else {
            model.addAttribute("msg","Unable to save record... !!");
        }
        return "index";
    }

    //viewing form data into ui page
    @GetMapping("/view")
    public String viewUserRecord(Model model) {
        List<User> userRecord = userService.getUserRecord();
        if(!userRecord.isEmpty()){
            model.addAttribute("users",userRecord);
        }else {
            model.addAttribute("msg", "Record not found.. !!");
        }
        return "view-user";
    }
}
