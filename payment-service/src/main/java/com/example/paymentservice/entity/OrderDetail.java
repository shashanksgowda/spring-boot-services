package com.example.paymentservice.entity;


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
}

