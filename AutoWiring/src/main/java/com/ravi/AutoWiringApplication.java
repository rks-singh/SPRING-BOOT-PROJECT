package com.ravi;

import com.ravi.bean.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AutoWiringApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AutoWiringApplication.class, args);
		Car car = context.getBean(Car.class);
		car.run();
	}

}
