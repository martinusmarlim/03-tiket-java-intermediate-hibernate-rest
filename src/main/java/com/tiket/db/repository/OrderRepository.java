package com.tiket.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiket.db.model.Order;


public interface OrderRepository extends JpaRepository<Order, Integer> {
	
}
