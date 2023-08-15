package com.ravi.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("petrol")
public class PetrolEng implements IEngine {
    public PetrolEng() {
        System.out.println("Petrol Engine :: Constructor");
    }
    public int start() {
        System.out.println("Petrol Engine Started.......!!");
        return 1;
    }
}
