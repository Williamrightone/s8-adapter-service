package cc.synpulse8.adapterservice.domain.infra;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic transactionTopic() {
        return TopicBuilder.name("transaction-topic")
                .partitions(1)
                .replicas(1)
                .build();
    }

}
