package com.ravi.rescontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ravi.model.Activity;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class MyActivityRestController {
	
	@GetMapping("/")
	@CircuitBreaker(name = "bored-api", fallbackMethod = "doWork")
	public String invokeBoredApi() {
		
		System.out.println("Main Logig is executed..");
		
		String url = "https://www.boredapi.com/api/activity";
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<Activity> responseEntity = restTemplate.getForEntity(url, Activity.class);
		
		Activity body = responseEntity.getBody();
		
		String activity = body.getActivity();
		
		int i= 10/0;
		
		return activity;
	}
	public String doWork( Throwable throwable) {
		System.out.println("Fall back logic is executed.");
		return "GO AND PLAY CRICKET MATCH..";
	}

}
