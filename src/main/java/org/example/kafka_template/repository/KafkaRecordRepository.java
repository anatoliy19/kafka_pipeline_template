package org.example.kafka_template.repository;

import org.example.kafka_template.dto.KafkaRecordDto;
import org.example.kafka_template.model.KafkaRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface KafkaRecordRepository extends JpaRepository<KafkaRecord,Long>, JpaSpecificationExecutor<KafkaRecord> {

    Optional<KafkaRecordDto> findKafkaRecordByName(String name);

    @Override
    Optional<KafkaRecord> findById(Long id);
}
