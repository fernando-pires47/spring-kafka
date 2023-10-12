package com.spring.kafkaproducer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducerController {

    private final Logger LOG = LoggerFactory.getLogger(KafkaProducerController.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;



    @GetMapping("/publish/{message}")
    public String publish(@PathVariable String message) {
        this.kafkaTemplate.send("test_topic", message);
        LOG.info("Sending : {}", message);
        LOG.info("--------------------------------");
        return "success";
    }
}
