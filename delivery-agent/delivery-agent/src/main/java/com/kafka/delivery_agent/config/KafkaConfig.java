package com.kafka.delivery_agent.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class KafkaConfig {
	
	@Bean
	public NewTopic newTopic() {
		return TopicBuilder
				.name(KafkaConstants.LOCATION_UPDATE_TOPIC)
//				.partitions(0)
//				.replicas(0)
				.build();
	}

}
