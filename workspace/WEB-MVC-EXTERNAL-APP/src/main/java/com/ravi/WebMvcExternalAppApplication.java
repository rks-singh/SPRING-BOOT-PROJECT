package com.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebMvcExternalAppApplication {

	@GetMapping("/greeting")
	public String greeting() { 
		return "Spring Application on external Web Server. !!";
	}
	public static void main(String[] args) {
		SpringApplication.run(WebMvcExternalAppApplication.class, args);
	}

}
