package com.ravi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.entity.Product;
import com.ravi.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping(value = "/product", 
			consumes = { "application/xml", "application/json" }, 
			produces = {"application/xml", "application/json" })
	public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
		return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
	}

	@GetMapping(value = "/product", 
			produces = { "application/xml", "application/json" })
	public ResponseEntity<List<Product>> getAllProduct() {
		return new ResponseEntity<>(productService.getAllProduct(), HttpStatus.OK);
	}

	@GetMapping(value = "/product/{pid}",
			produces = { "application/xml", "application/json" })
	public ResponseEntity<Product> getProduct(@PathVariable("pid") Integer pid) {
		return new ResponseEntity<Product>(productService.getProduct(pid), HttpStatus.OK);
	}
}
