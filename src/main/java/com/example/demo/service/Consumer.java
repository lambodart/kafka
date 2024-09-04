package com.example.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	
	@KafkaListener(topics = "random",groupId = "random_group")
	public void listenToTopic(String msg) {
		System.out.println("Listen to Topic :: "+msg);
	}
}
