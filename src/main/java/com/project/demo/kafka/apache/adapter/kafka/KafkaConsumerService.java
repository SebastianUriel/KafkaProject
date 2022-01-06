package com.project.demo.kafka.apache.adapter.kafka;

import com.project.demo.kafka.apache.domain.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    private final Logger logger = LoggerFactory.getLogger(KafkaConsumerService.class);

    @KafkaListener(topics = "test-spring", groupId = "group-spring")
    public void consume(Message message) {
        logger.info(String.format("Message received -> %s", message.toString()));
    }

}
