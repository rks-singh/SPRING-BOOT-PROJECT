package com.ravi;

import com.ravi.service.BookServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BookStoreProjectApplication {

	public static void main(String[] args) {
	  ConfigurableApplicationContext context =
			  SpringApplication.run(BookStoreProjectApplication.class, args);

		BookServiceImpl bookService = context.getBean(BookServiceImpl.class);
		bookService.getBook();
	}

}
