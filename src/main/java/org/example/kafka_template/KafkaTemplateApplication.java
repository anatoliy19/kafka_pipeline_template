package org.example.kafka_template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan({"org.example.kafka_template.repository"})
@EnableJpaRepositories("org.example.kafka_template.repository")
@EntityScan("org.example.kafka_template.model")
public class KafkaTemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaTemplateApplication.class, args);
    }
}
