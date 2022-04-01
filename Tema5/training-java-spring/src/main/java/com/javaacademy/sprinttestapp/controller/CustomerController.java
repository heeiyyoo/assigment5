package com.javaacademy.sprinttestapp.controller;

import com.javaacademy.sprinttestapp.model.Customers;
import com.javaacademy.sprinttestapp.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public List<Customers> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/customers/{id}")
    public Customers getById(@PathVariable Integer id)
    {
        return customerService.getById(id);
    }

    @PostMapping("/customers")
    public Customers createCustomer(@RequestBody Customers customers){
        customerService.insert(customers);
        return customers;
    }
    @PostMapping("/customers/update")
    public Customers updateCustomer(@RequestBody Customers customers){
        customerService.update(customers);
        return customers;
    }

    @DeleteMapping("/customers/{id}")
    public void deleteCustomer(@PathVariable Integer id){
        customerService.delete(id);
    }
}