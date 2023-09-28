package com.ravi.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ravi.request.Passenger;
import com.ravi.response.Ticket;

@Service
public class PassengerServiceImpl implements PassengerService {

	@Override
	public Ticket bookTicket(Passenger passenger) {

		String apiUrl = "http://localhost:9090/ticket";

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Ticket> responseEntity = restTemplate.postForEntity(apiUrl, passenger, Ticket.class);
		Ticket responsebody = responseEntity.getBody();
		return responsebody;
	}

	@Override
	public List<Ticket> getAllTickets() {

		String apiUrl = "http://localhost:9090/tickets";

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Ticket[]> responseEntity = restTemplate.getForEntity(apiUrl, Ticket[].class);
		Ticket[] body = responseEntity.getBody();
		List<Ticket> tickets = Arrays.asList(body);
		return tickets;
	}

	@Override
	public Ticket getTicket(Integer id) {
		String apiUrl = "http://localhost:9090/ticket/{id}";

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Ticket> responseEntity = restTemplate.getForEntity(apiUrl, Ticket.class, id);
		Ticket responsebody = responseEntity.getBody();
		return responsebody;
	}

}
