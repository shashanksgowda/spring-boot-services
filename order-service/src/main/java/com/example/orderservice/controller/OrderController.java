package com.example.orderservice.controller;

import com.example.orderservice.entity.Order;
import com.example.orderservice.entity.OrderDetail;
import com.example.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping()
    public ResponseEntity placeOrder(@RequestBody Order order) {
        if(orderService.saveOrder(order) != null){
            return new ResponseEntity(order.getId(), HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<OrderDetail> getOrder(@PathVariable String orderId){
        try {
            Order order = orderService.getOrderById(orderId);
            if(order instanceof Order){
                OrderDetail orderDetail = new OrderDetail(order);
                return new ResponseEntity<OrderDetail>(orderDetail, HttpStatus.OK);
            }
        }catch (EntityNotFoundException ex){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<OrderDetail>(new OrderDetail(), HttpStatus.NOT_FOUND);
    }
}
