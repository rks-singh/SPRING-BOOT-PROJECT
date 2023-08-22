package com.ravi;

import com.ravi.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context
				= SpringApplication.run(Application.class, args);
		ProductService productService = context.getBean(ProductService.class);
//		productService.storeProduct();
//		productService.getAllProduct();
//		productService.pagination();
//		productService.paginationSort();
		productService.queryByExample();
	}

}
