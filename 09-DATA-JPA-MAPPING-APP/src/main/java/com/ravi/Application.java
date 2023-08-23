package com.ravi;

import com.ravi.service.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		PersonService personService = context.getBean(PersonService.class);

//		personService.storeRecord();
		personService.getRecord(1);
	}


}
