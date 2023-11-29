package org.example.kafka_template.service;

import org.example.kafka_template.dto.KafkaRecordDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface KafkaRecordService {

    abstract List<KafkaRecordDto> findAll();

    Optional<KafkaRecordDto> findKafkaRecordByName(String name);
    Optional<KafkaRecordDto> findById(Integer integer);
    KafkaRecordDto addKafkaRecordDto(KafkaRecordDto kafkaRecordDto);

    KafkaRecordDto updateKafkaRecordDto(KafkaRecordDto kafkaRecordDto);




}
