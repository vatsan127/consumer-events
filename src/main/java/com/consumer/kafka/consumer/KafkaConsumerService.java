package com.consumer.kafka.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerService {

    private final ObjectMapper objectMapper = new ObjectMapper();
    Logger logger = LoggerFactory.getLogger(KafkaListener.class);

    @KafkaListener(topics = "employee", groupId = "groupId")
    void listener(String message) {
        String info = String.format("message - %s", message);
        logger.info(info);

    }
}