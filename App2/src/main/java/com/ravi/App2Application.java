package com.ravi;
import com.ravi.beans.Car;
import com.ravi.beans.Engine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// specifying more than on base package in project.
@ComponentScan(basePackages = {"com.ravi","com.tcs"})
public class App2Application {


	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(App2Application.class, args);
//		Engine engine1 = run.getBean(Engine.class);
//		Engine engine2 = run.getBean(Engine.class);

//		System.out.println(engine1.hashCode());
//		System.out.println(engine2.hashCode());
//		engine1.start();


		Car car1 = run.getBean(Car.class);
//		Car car2 = run.getBean(Car.class);
//		System.out.println(car1.hashCode());
//		System.out.println(car2.hashCode());
		car1.drive();

	}

}
