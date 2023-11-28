package com.ravi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "WELCOME-API")
public interface WelcomeApiClient {

	@GetMapping("/message")
	public String invokeWelcomeApi();
}
