package com.tiket.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiket.db.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
