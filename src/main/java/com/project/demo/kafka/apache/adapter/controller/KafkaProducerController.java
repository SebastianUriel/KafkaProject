package com.project.demo.kafka.apache.adapter.controller;

import com.project.demo.kafka.apache.adapter.controller.model.MessageRequest;
import com.project.demo.kafka.apache.adapter.kafka.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaProducerController {

    private final KafkaProducerService producerService;

    @Autowired
    public KafkaProducerController(KafkaProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestBody MessageRequest message) {
        this.producerService.sendMessage(message.toDomain());
    }

}
