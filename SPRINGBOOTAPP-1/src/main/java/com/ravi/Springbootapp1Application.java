package com.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springbootapp1Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Springbootapp1Application.class, args);
		System.out.println("Class Name ::"+context.getClass().getName());
	}

}
