package com.ravi.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.binding.Product;

@RestController
public class ProductController {

	@GetMapping("/product")
	public Product getProduct() {
		Product product1 = new Product(101, "Phone", 1234.45);
		return product1;
	}
}
