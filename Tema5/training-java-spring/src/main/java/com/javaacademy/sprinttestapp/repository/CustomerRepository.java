package com.javaacademy.sprinttestapp.repository;

import com.javaacademy.sprinttestapp.model.Customers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customers,Integer> {
     Customers getById(Integer id);
}

