package com.kafka.delivery_agent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.kafka.delivery_agent.config.KafkaConstants;

@Service
public class KafkaService {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public boolean updateLocation(String location) {
		this.kafkaTemplate.send(KafkaConstants.LOCATION_UPDATE_TOPIC, location);
		System.out.println("location updated!!!");
		return true;
	}
}
