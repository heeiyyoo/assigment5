package com.javaacademy.sprinttestapp.controller;

import com.javaacademy.sprinttestapp.model.OrderDetails;
import com.javaacademy.sprinttestapp.model.Orders;
import com.javaacademy.sprinttestapp.services.OrderDetailsService;
import com.javaacademy.sprinttestapp.services.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderDetailsController {
    @Autowired
    OrderDetailsService orderDetailsService;

    @GetMapping("/orderdetails/{id}")
    public List<OrderDetails> getById(@PathVariable Integer id){
        return orderDetailsService.getByOrdersId(id);
    }
}