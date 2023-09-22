package com.ravi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.binding.Product;

@RestController
public class ProductController {
	
	@GetMapping("/product")
	public Product getProduct(@RequestParam("pid")Integer pid) {
		Product p = new Product(pid,"Mouse",500.50);
		return p;
	}

}
