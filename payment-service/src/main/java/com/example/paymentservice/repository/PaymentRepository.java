package com.example.paymentservice.repository;

import com.example.paymentservice.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PaymentRepository extends  JpaRepository<Payment, Integer> {

    @Query( "SELECT P FROM Payment P WHERE ORDER_ID = ?1 AND STATUS = \'SUCCESS\' ")
    Collection<Payment> isPaymentDone(String orderId);
}
