package com.spring.kafkaconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@KafkaListener(groupId = "consumer2", topics = "test_topic")
public class KafkaConsumer2 {

    private final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaHandler
    void receive(@Payload String message,
                 @Header(KafkaHeaders.RECEIVED_PARTITION) int partition,
                 @Header(KafkaHeaders.OFFSET) int offset) {
        LOG.info("Consumer: {}, Message: {}, Partition:{}, Offset:{}", "consumer2", message, partition, offset);
        LOG.info("--------------------------------");
    }
}
