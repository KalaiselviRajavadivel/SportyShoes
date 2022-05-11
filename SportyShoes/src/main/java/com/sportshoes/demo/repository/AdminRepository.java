package com.sportshoes.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportshoes.demo.model.AdminModel;


public interface AdminRepository extends JpaRepository<AdminModel, Integer>{
 
}