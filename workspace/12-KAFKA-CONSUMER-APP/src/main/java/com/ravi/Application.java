package com.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.ravi.constants.AppConstant;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@KafkaListener(topics = AppConstant.TOPIC, groupId = "group_product_order")
	public void SubscribeMsg(String order) {
		System.out.print("==> Message Receved from Kafka :: ");
		System.out.println(order);
	}
}
