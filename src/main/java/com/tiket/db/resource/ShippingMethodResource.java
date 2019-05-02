package com.tiket.db.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiket.db.model.ShippingMethod;
import com.tiket.db.repository.ShippingMethodRepository;

@RestController
@RequestMapping(value = "/rest/shippingmethods")
public class ShippingMethodResource {

    @Autowired
    ShippingMethodRepository shippingMethodRepository;

    @GetMapping(value = "/all")
    public List<ShippingMethod> getAll() {
        return shippingMethodRepository.findAll();
    }

	
}
