package com.example.paymentservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    @Id
    @GeneratedValue
    @Column(name = "payment_id")
    int id;
    @Column(name = "order_id")
    String orderId;
    double amount;
    String status;
    @Column(name = "transaction_id")
    String transactionId;
    int quantity;
    @Column(name = "transaction_date")
    Date date;

    public Payment(OrderDetail orderDetail){
        this.orderId = orderDetail.getOrderId();
        this.quantity = orderDetail.getQuantity();
        this.amount = orderDetail.getQuantity() * orderDetail.getPricePerQuantity();
        this.transactionId = UUID.randomUUID().toString();
        this.date = new Date();
    }
}
