package com.example.ce2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ce2.model.Student;
 
public interface StudentRepo extends JpaRepository<Student,Integer> {
    
}
