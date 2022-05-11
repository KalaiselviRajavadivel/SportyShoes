package com.sportshoes.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportshoes.demo.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {
	 
}