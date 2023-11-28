package com.ravi.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ravi.model.Activity;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class ActivityController {

	private static final String BORED_API_URL = "https://www.boredapi.com/api/activity";
	
	@GetMapping("/")
	@CircuitBreaker(name = "fallbackActivity", fallbackMethod = "fallBackRandomActivity")
	public String getRandomActivity() {
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<Activity> entity = restTemplate.getForEntity(BORED_API_URL, Activity.class);
		Activity body = entity.getBody();
		String activity = body.getActivity();
		return activity;
	}
	
	public String fallBackRandomActivity(Throwable throwable) {
		return "GO AND WATCH TUTORIAL ON YOUTUBE";
	}
}
