package com.ravi.service;

import java.util.List;

import com.ravi.entity.Product;

public interface ProductService {

	public Product saveProduct(Product product);

	public List<Product> getAllProduct();

	public Product getProduct(Integer pid);
}
