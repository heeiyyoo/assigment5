package com.javaacademy.sprinttestapp.repository;

import com.javaacademy.sprinttestapp.model.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OrdersRepository extends CrudRepository<Orders,Integer> {
    List<Orders> getByCustomerId(Integer Id);
    List<Orders> getAllByCustomerId(Integer id);
}
