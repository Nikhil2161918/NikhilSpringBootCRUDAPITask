package com.example.demo.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.springboot.Entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long > {
}
