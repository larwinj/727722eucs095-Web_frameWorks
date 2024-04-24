package com.example.ce1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ce1.model.Children;

public interface ChildrenRepo extends JpaRepository<Children, Integer> {
    
}