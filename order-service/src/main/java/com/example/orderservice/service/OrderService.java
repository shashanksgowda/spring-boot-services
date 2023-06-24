package com.example.orderservice.service;

import com.example.orderservice.entity.Order;
import com.example.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order saveOrder(Order order){
        order.setId(UUID.randomUUID().toString());
        return orderRepository.save(order);
    }

    public Order getOrderById(String orderId){
        return orderRepository.getById(orderId);
    }
}
