package com.ravi;

import com.ravi.entities.UserMasterEntity;
import com.ravi.service.UserMasterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
// Custom Query Example.

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(Application.class, args);

		UserMasterService userMasterService = context.getBean(UserMasterService.class);
//		userMasterService.getAllStudentHQL();
//		userMasterService.getAllStudentSQL();
//		userMasterService.getByCityHQL();
//		userMasterService.getByCitySQL();
//		userMasterService.getALLEmailHQL();
//		userMasterService.getAllEmailSQL();
//		userMasterService.getAllEmailCity();
//		userMasterService.getNameAndEmailHQL();
//		userMasterService.getNameAndEmailSQL();
//		userMasterService.updateAge();
		userMasterService.deleteUser();

	}


}
