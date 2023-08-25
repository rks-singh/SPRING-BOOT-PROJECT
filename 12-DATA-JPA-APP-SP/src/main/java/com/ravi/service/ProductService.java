package com.ravi.service;

import com.ravi.entities.Product;
import com.ravi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void getProductRecord() {
        List<Product> productRecord = productRepository.getProductRecord();
        productRecord.forEach(System.out::println);
    }
}
