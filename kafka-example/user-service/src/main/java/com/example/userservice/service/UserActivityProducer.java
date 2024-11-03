package com.example.userservice.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class UserActivityProducer {
    private static final String TOPIC = "user-activity";
    private final KafkaTemplate<String, String> kafkaTemplate;

    public UserActivityProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendActivity(String activityMessage) {
        kafkaTemplate.send(TOPIC, activityMessage);
    }
}
