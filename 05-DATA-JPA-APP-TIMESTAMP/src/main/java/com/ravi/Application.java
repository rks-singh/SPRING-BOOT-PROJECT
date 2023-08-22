package com.ravi;

import com.ravi.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		BookService bookService = context.getBean(BookService.class);
//		bookService.storeBook();
//		bookService.updateBookPrice();
		bookService.updateActiveSwitch("N",1);
	}

}
