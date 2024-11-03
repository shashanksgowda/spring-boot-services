package com.example.userservice.controller;

import org.springframework.web.bind.annotation.*;
import com.example.userservice.service.UserActivityProducer;

@RestController
@RequestMapping("/activity")
public class ActivityController {

    private final UserActivityProducer producer;

    public ActivityController(UserActivityProducer producer) {
        this.producer = producer;
    }

    @PostMapping
    public String sendActivity(@RequestBody String message) {
        System.out.println("Hello " + message);
        producer.sendActivity(message);
        return "Activity sent to Kafka: " + message;
    }

    @GetMapping("/hello")
    public String getMessage() {
        return "Hello world";
    }
}
