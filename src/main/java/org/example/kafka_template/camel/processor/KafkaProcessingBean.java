package org.example.kafka_template.camel.processor;

import org.example.kafka_template.dto.messageformat.KafkaRawHoData;
import org.springframework.stereotype.Component;

// EXAMPLE
@Component
public class KafkaProcessingBean {
    public KafkaRawHoData process(KafkaRawHoData kafkaRawHoData) {
        kafkaRawHoData.setInn("some new inn");
        return kafkaRawHoData;
    }
}
