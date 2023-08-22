package com.ravi.service;

import com.ravi.entities.Product;
import com.ravi.repositiory.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void storeProduct() {
        Product p1 = new Product(101,"Monitor",10000.50);
        Product p2 = new Product(102,"Mouse",1000.20);
        Product p3 = new Product(103, "Keyboard", 4000.50);
        Product p4 = new Product(104, "Printer", 30000.50);
        Product p5 = new Product(105, "Cpu", 10000.50);
        productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
    }
    public void getAllProduct() {
        List<Product> productList = productRepository.findAll(Sort.by("id").descending());
        productList.forEach(System.out::println);
    }

    public void pagination() {
        int pageNumber = 0;
        int pageSize = 3;
        PageRequest pageRequest = PageRequest.of(pageNumber+1, pageSize);
        Page<Product> productPage = productRepository.findAll(pageRequest);
        int totalPage = productPage.getTotalPages();
        System.out.println("Total pages ::" + totalPage);
        List<Product> content = productPage.getContent();
        content.forEach(System.out::println);
    }

    // Pagination Example ==> Pagination means dividing table record into multiple pages.
    public void paginationSort() {
        int pageNumber =0;
        int pageSize = 2;
        PageRequest pageRequest = PageRequest.of(pageNumber+2, pageSize);
        Page<Product> productPage = productRepository.findAll(pageRequest);
        int totalPages = productPage.getTotalPages();
        System.out.println("Total Page ::" + totalPages);
        List<Product> content = productPage.getContent();
        content.forEach(System.out::println);
    }

    // QueryByExample(QBE) Example ==> It is used to implement dynamic search and filter.
    public void queryByExample() {
        Product entity = new Product();
        entity.setId(101);
        entity.setName("cpu");
        List<Product> products = productRepository.findAll(Example.of(entity));
        products.forEach(System.out::println);
    }

}
