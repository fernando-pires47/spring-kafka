package com.spring.kafkaconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(groupId = "consumer1", topics = "test_topic")
    public void receive( @Payload String message,
                         @Header(KafkaHeaders.RECEIVED_PARTITION) int partition,
                         @Header(KafkaHeaders.OFFSET) int offset) {
        LOG.info("Consumer: {}, Message: {}, Partition:{}, Offset:{}", "consumer1", message, partition, offset);
        LOG.info("--------------------------------");
    }
}
