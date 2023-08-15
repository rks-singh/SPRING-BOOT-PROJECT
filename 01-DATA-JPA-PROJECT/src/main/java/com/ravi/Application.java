package com.ravi;

import com.ravi.userService.UserMasterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

// Communicating with database using Repository Interface predefined method.
// using predefined method we can retrieve the data from database using primary key only.
// here, data-jpa write query for us. We need not write sql query explicitly.


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	  ConfigurableApplicationContext context =
			  SpringApplication.run(Application.class, args);

		UserMasterService userMasterService = context.getBean(UserMasterService.class);
//		userMasterService.insertData();
//		userMasterService.findById();
//		userMasterService.findAllById();
//		userMasterService.findALl();
//		userMasterService.existById();
//		userMasterService.count();

//		userMasterService.deleteById();
//		userMasterService.findALl();

//		userMasterService.deleteAllById();
//		userMasterService.findALl();

//		userMasterService.deleteALL();
//		userMasterService.findALl();
	}

}
