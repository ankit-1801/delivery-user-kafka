package com.kafka.end_user.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class Config {

	
	@KafkaListener(topics = KafkaConstants.LOCATION_UPDATE_TOPIC,groupId = KafkaConstants.GROUP_ID)
	private void updateLocation(String value) {
		System.out.println("Location : "  + value);
	}
}
