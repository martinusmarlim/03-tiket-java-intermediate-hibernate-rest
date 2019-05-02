package com.tiket.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiket.db.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
