package com.javaacademy.sprinttestapp.services;

import com.javaacademy.sprinttestapp.model.OrderDetails;
import com.javaacademy.sprinttestapp.model.Orders;
import com.javaacademy.sprinttestapp.repository.OrderDetailsRepository;
import com.javaacademy.sprinttestapp.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderDetailsService {
    @Autowired
    OrderDetailsRepository orderDetailsRepository;

    public List<OrderDetails> getByOrdersId(Integer id) {
        return orderDetailsRepository.getAllByOrdersId(id);
    }
}
