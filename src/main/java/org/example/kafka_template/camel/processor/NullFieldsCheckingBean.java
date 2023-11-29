package org.example.kafka_template.camel.processor;

import org.example.kafka_template.dto.messageformat.KafkaData;
import org.springframework.stereotype.Component;

@Component
public class NullFieldsCheckingBean {
    public boolean validate(KafkaData data) throws IllegalAccessException {
        return data.isAnyNull();
    }

}
