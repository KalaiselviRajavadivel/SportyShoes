package com.sportshoes.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportshoes.demo.model.OrderModel;


public interface OrderRepository extends JpaRepository<OrderModel, Integer> {

}
