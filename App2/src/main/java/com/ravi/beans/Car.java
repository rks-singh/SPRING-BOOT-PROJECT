package com.ravi.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Car {

    // field injection.
//    @Autowired

    private Engine engine;

    public Car(){
        System.out.println("Car :: Constructor Executed");
    }

    // Constructor injection.
//    @Autowired
//    public Car(Engine engine) {
//        this.engine = engine;
//    }


    // Setter Injection.
    @Autowired
    public void setEngine(Engine engine) {
        this.engine=engine;
    }
    public void drive(){
        int status = engine.start();
        if(status>=1){
            System.out.println("Journey Started...");
        }
    }
}
