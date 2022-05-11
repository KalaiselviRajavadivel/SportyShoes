package com.sportshoes.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportshoes.demo.model.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, Integer> {
 
}