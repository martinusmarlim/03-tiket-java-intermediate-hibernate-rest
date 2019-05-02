package com.tiket.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiket.db.model.ShippingMethod;

public interface ShippingMethodRepository extends JpaRepository<ShippingMethod, Integer> {
}
