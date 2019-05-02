package com.tiket.db.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tiket.db.model.Employee;
import com.tiket.db.repository.EmployeeRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/employees")
public class EmployeeResource {

    @Autowired
    EmployeeRepository employeesRepository;

    @GetMapping(value = "/all")
    public List<Employee> getAll() {
        return employeesRepository.findAll();
    }

	/*
	 * @GetMapping(value = "/update/{name}") public List<Employee>
	 * getUpdate(@PathVariable final String name) { return
	 * employeesRepository.findAll(); }
	 */
    
    /*
    @PostMapping(value = "/load")
    public List<Employee> persist(@RequestBody final Employee employee) {
        employeesRepository.save(employee);
        return employeesRepository.findAll();
    }
    */
}
