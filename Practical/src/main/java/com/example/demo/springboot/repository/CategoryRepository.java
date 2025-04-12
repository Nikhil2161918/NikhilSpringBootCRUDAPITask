package com.example.demo.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.springboot.Entity.Category;

public interface CategoryRepository extends JpaRepository<Category,Long>{

}
