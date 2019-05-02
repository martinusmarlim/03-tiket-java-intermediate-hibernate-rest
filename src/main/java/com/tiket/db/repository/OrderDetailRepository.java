package com.tiket.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiket.db.model.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {
	
}
