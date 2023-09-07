package com.ravi.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
// priority always goes to local exception handler. And then local exception handler.
// first priority goes to specific exception and then parent class exception.
// global exception handling.
@ControllerAdvice
public class AppExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public String appExceptionHandler(Exception ex, Model model) {

        model.addAttribute("expRes", ex.getMessage());
        model.addAttribute("date", LocalDateTime.now());
        return "error";
    }
}
