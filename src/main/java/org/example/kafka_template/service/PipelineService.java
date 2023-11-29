package org.example.kafka_template.service;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface PipelineService {
//    ActivationPipelineResponse startPipe(ActivationPipelineRequest request);

    void startPipe(String routeId, Optional<Long> s);

    void stopPipe(String routeId);
}
