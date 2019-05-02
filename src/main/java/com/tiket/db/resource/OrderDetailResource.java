package com.tiket.db.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiket.db.model.OrderDetail;
import com.tiket.db.repository.OrderDetailRepository;
import com.tiket.db.repository.ProductRepository;

@RestController
@RequestMapping(value = "/rest/orderdetails")
public class OrderDetailResource {

    @Autowired
    OrderDetailRepository orderDetailRepository;
    
    @Autowired
    ProductRepository productRepository;
    
    @GetMapping(value = "/all")
    public List<OrderDetail> getAll() {
        return orderDetailRepository.findAll();
    }

	
}
