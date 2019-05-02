package com.tiket.db.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiket.db.model.Customer;
import com.tiket.db.repository.CustomerRepository;

@RestController
@RequestMapping(value = "/rest/customers")
public class CustomerResource {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/all")
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

	
}
