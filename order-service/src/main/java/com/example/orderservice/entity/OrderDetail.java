package com.example.orderservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {
    private String orderId;
    private String productId;
    private int quantity;
    private double pricePerQuantity;
    private Date orderDate;

    public OrderDetail(Order order){
        this.orderId = order.getId();
        this.productId = order.getProductId();
        this.quantity = order.getQuantity();
        this.pricePerQuantity = order.getPricePerQuantity();
        this.orderDate = order.getOrderDate();
    }
}
