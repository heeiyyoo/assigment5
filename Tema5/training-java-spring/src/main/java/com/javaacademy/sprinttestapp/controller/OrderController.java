package com.javaacademy.sprinttestapp.controller;

import com.javaacademy.sprinttestapp.model.Orders;
import com.javaacademy.sprinttestapp.services.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrdersService ordersService;

    @GetMapping("/orders/{id}")
    public Orders getById(@PathVariable Integer id){
        return ordersService.getById(id);
    }

    @GetMapping("/orders")
    public List<Orders> getAllOrders(){
        return ordersService.getAllOrders();
    }

    @PostMapping("/orders")
    public Orders createOrder(@RequestBody Orders order){
        ordersService.insert(order);
        return order;
    }

    @PostMapping("/orders/{id}/{status}/updateStatus")
    public void updateOrder(@PathVariable Integer id,@PathVariable String status){
        ordersService.updateStatus(id,status);
    }

    @DeleteMapping("/orders/{id}")
    public void deleteOrder(@PathVariable Integer id){
        ordersService.delete(id);
    }

    @GetMapping("/orders/{id}/getByCustomerId")
    public List<Orders> customerOrders(@PathVariable Integer id){
        return ordersService.getByCustomerId(id);
    }
}
