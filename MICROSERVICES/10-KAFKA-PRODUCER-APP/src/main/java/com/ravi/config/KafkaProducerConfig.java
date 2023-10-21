package com.ravi.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.ravi.constants.AppConstant;
import com.ravi.model.Order;

@Configuration
public class KafkaProducerConfig {

	@Bean
	public ProducerFactory<String, Order> producerFactory(){
		
		Map<String, Object> configProp = new HashMap<>();
		configProp.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConstant.HOST);
		configProp.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		configProp.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		return new DefaultKafkaProducerFactory<>(configProp);
	}
	
	@Bean
	public KafkaTemplate<String, Order> kafkaTemplate(){
		return new KafkaTemplate<>(producerFactory());
	}
}
