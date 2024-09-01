package com.kafka.delivery_agent.controller;

import java.util.Iterator;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.delivery_agent.service.KafkaService;

@RestController
@RequestMapping("/location")
public class DeliveryController {

	@Autowired
	private KafkaService kafkaService;
	
	
	@PostMapping("/update")
	public ResponseEntity<?> updateLocation(){
	    for (int i = 0; i < 300000; i++) {			
	    	kafkaService.updateLocation("( "+Math.round(Math.random()*1000) + " , "+ Math.round(Math.random()*1000) +" )");
		}
		return new ResponseEntity<>(Map.of("message","Location updated!!"),HttpStatus.OK);
	}
}
