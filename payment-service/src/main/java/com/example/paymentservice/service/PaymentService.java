package com.example.paymentservice.service;

import com.example.paymentservice.entity.Payment;
import com.example.paymentservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public Payment add(Payment payment){
        String status = new Random().nextBoolean() ? "SUCCESS" : "FAILED";
        payment.setStatus(status);
        return paymentRepository.save(payment);
    }

    public Iterable<Payment> getAllPayments(){
        return paymentRepository.findAll();
    }

    public boolean hasPaymentDoneForOrder(String orderId){
        return paymentRepository.isPaymentDone(orderId).size() > 0;
    }
}
