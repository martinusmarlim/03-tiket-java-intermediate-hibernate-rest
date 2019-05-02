package com.tiket.db.resource;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiket.db.model.Order;
import com.tiket.db.repository.CustomerRepository;
import com.tiket.db.repository.EmployeeRepository;
import com.tiket.db.repository.OrderDetailRepository;
import com.tiket.db.repository.OrderRepository;
import com.tiket.db.repository.ShippingMethodRepository;

@RestController
@RequestMapping(value = "/rest/orders")
public class OrderResource {

	@PersistenceContext
	private EntityManager em;
	 
    @Autowired
    EmployeeRepository employeesRepository;
    
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    ShippingMethodRepository shippingMethodRepository;

    @Autowired
    OrderDetailRepository orderDetailRepository;
    
    @Autowired
    OrderRepository orderRepository;

    @GetMapping(value = "/all")
    public List<Order> getAll() {
    	
        return orderRepository.findAll(); 
    }
    
}
