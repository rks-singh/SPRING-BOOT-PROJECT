package com.ravi;

import com.ravi.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmployeeService employeeService = context.getBean(EmployeeService.class);
//		employeeService.storeRecord();
//		employeeService.getRecord(1);
//		employeeService.getAddressRecord(1);
//		employeeService.deleteEmployee(1);
		employeeService.deleteAddress(2);
	}

}
