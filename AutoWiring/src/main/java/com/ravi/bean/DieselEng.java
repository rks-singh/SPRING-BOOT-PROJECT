package com.ravi.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("diesel")
public class DieselEng implements IEngine {

    public DieselEng() {
        System.out.println("Diesel Engine :: Constructor");
    }

    public int start() {
        System.out.println("Diesel Engine Started......!!");
        return 1;
    }
}
