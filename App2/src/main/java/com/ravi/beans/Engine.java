package com.ravi.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Engine {
    public Engine(){
        System.out.println("Engine  :: Constructor Executed.");
    }

    public int start(){
        System.out.println("Engin Started..");
        return 1;
    }
}
