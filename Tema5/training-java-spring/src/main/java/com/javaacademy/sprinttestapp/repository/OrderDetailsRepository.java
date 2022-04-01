package com.javaacademy.sprinttestapp.repository;

import com.javaacademy.sprinttestapp.model.OrderDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OrderDetailsRepository extends CrudRepository<OrderDetails,Integer> {
    List<OrderDetails> getByOrdersId(Integer Id);
    List<OrderDetails> getAllByOrdersId(Integer id);
}