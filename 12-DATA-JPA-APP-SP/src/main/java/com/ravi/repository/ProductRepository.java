package com.ravi.repository;

import com.ravi.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "call getProductRecord()",nativeQuery = true)
    public List<Product> getProductRecord();
}
