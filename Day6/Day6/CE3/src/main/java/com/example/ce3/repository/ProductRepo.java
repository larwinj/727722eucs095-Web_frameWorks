package com.example.ce3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ce3.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

    
}
