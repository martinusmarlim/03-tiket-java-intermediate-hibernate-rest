package com.tiket.db.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiket.db.model.Product;
import com.tiket.db.repository.OrderDetailRepository;
import com.tiket.db.repository.ProductRepository;

@RestController
@RequestMapping(value = "/rest/products")
public class ProductResource {

    @Autowired
    ProductRepository productRepository;
    
    @Autowired
    OrderDetailRepository orderDetailRepository;

    @GetMapping(value = "/all")
    public List<Product> getAll() {
        return productRepository.findAll();
    }

	
}
