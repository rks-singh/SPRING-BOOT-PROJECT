package com.ravi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.constant.AppConstant;
import com.ravi.model.Order;

@RestController
public class OrderRestController {

	@Autowired
	private KafkaTemplate<String, Order> kafkaTemplate;
	
	@PostMapping("/order")
	public String saveOrder(@RequestBody Order order) {
		kafkaTemplate.send(AppConstant.TOPIC,order);
		return "Order Placed..";
	}
}
