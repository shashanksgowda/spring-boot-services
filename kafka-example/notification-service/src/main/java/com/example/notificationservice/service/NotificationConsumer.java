package com.example.userservice.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {

    @KafkaListener(topics = "user-activity", groupId = "notification-group")
    public void consumeActivity(String message) {
        System.out.println("Received activity notification: " + message);
        // Add logic to send a notification to users
    }
}