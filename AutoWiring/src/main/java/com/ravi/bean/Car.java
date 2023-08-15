package com.ravi.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    @Qualifier("petrol")
    private IEngine engine;
    public Car() {
        System.out.println("Car :: Constructor");
    }

    public void run() {
        int status = engine.start();
        if (status == 1) {
            System.out.println("You can drive the Car");
        }
    }
}
