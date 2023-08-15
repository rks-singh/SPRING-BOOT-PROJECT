package com.ravi.utils;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
public class ConfigDemo {

    public ConfigDemo(){
        System.out.println("ConfigDemo :: Constructor Executed");
    }

    public ConfigDemo(String name) {
        System.out.println("Name ::"+name);
    }
    public void display() {
        System.out.println("Hello welcome to ConfigDemo");
    }
}
