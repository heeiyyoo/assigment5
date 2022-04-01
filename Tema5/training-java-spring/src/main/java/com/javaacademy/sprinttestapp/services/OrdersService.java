package com.javaacademy.sprinttestapp.services;

import com.javaacademy.sprinttestapp.model.Orders;
import com.javaacademy.sprinttestapp.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrdersService {
    @Autowired
    OrdersRepository ordersRepository;

    public Orders getById(Integer id) {
        return ordersRepository.findById(id).get();
    }

    public List<Orders> getAllOrders() {
        List<Orders> aux = new ArrayList<>();
        ordersRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    public void insert(Orders order) {
        ordersRepository.save(order);
    }

    public void updateStatus(Integer id, String status) {
        Orders order = ordersRepository.findById(id).get();
        order.setStatus(status);
        ordersRepository.save(order);
    }

    public void delete(Integer id) {
        ordersRepository.delete(ordersRepository.findById(id).get());
    }

    public List<Orders> getByCustomerId(Integer id) {
        return ordersRepository.getAllByCustomerId(id);
    }
}
