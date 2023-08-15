package com.ravi;

import com.ravi.service.UserMasterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

// Here, to perform crud operation we will use findByxxx() method.
// xxx ==> entity class column name. method name plays important role.
// method name are not case sensitive. we have to follow camel case naming convention.
// findByMethod() are used to retrieve record based on non-primary key column.
// findBy() method return list of entity.
// findByxxx() method are abstract method which are written in Repository interface

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	 ConfigurableApplicationContext context =
			 SpringApplication.run(Application.class, args);

		UserMasterService userMasterService = context.getBean(UserMasterService.class);
//		userMasterService.insertRecord();
//		userMasterService.findByGender();
//		userMasterService.findByCity();
//		userMasterService.findByGenderAndCity();
//		userMasterService.findByAgeGreaterThanEqual();
		userMasterService.findByCityIn();
	}

}
