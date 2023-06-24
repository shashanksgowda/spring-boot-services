package com.example.orderservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "order_tb")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @Column(name = "order_id")
    private String id;
    @Column(name = "product_id")
    private String productId;
    private int quantity;
    @Column(name = "price_per_quantity")
    private double pricePerQuantity;
    @Column(name = "order_date")
    private Date orderDate;
}
