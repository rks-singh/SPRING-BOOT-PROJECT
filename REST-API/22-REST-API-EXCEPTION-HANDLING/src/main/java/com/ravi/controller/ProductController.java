package com.ravi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.exception.ProductNotFoundException;

@RestController
public class ProductController {

	@GetMapping("product/{pid}")
	public String getProduct(@PathVariable("pid") Integer pid) {

		if (pid > 100) {
			throw new ProductNotFoundException("Invalid Product Id");
		}
		return "KEYBOARD :: 2000 INR";

	}

}
