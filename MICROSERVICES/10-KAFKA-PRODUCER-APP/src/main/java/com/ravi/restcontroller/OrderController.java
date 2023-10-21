package com.ravi.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.constants.AppConstant;
import com.ravi.model.Order;

@RestController
public class OrderController {

	@Autowired
	private KafkaTemplate<String, Order> kafkaTemplate;

	@PostMapping("/order")
	public ResponseEntity<String> placeOrder(@RequestBody Order order) {
		kafkaTemplate.send(AppConstant.TOPIC, order);
		return new ResponseEntity<>("Order Palced..", HttpStatus.CREATED);
	}

}
