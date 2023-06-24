package com.example.paymentservice.controller;

import com.example.paymentservice.entity.OrderDetail;
import com.example.paymentservice.entity.Payment;
import com.example.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/{orderId}")
    public ResponseEntity<String> makePayment(@PathVariable String orderId){
        if(paymentService.hasPaymentDoneForOrder(orderId)) {
             return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        OrderDetail orderDetail = restTemplate.getForObject("http://ORDER-SERVICE/order/" + orderId, OrderDetail.class);
        if(orderDetail == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        Payment payment = new Payment(orderDetail);
        try {
            paymentService.add(payment);
            if(!"Success".equalsIgnoreCase(payment.getStatus())){
                return new ResponseEntity<>("Payment failed!", HttpStatus.CREATED);
            }
        } catch(Exception ex){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @GetMapping("/all")
    public Iterable<Payment> getAllPayments(){
        return paymentService.getAllPayments();
    }




}
