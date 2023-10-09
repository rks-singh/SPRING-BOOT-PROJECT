package com.ravi.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.ravi.request.Passenger;
import com.ravi.response.Ticket;

import reactor.core.publisher.Mono;

@Service
public class PassengerServiceImpl implements PassengerService {

	@Override
	public Mono<Ticket> bookTicket(Passenger passenger) {

		String apiUrl = "http://localhost:9090/ticket";

		WebClient webClient = WebClient.create();
		Mono<Ticket> ticket = webClient.post()
				.uri(apiUrl)
				.body(BodyInserters.fromValue(passenger))
				.retrieve()
				.bodyToMono(Ticket.class);
		
		return ticket;
	}

	@Override
	public Mono<Ticket[]> getAllTickets() {

		String apiUrl = "http://localhost:9090/tickets";

		WebClient webClient = WebClient.create();
		Mono<Ticket[]> tickets = webClient.get()
				.uri(apiUrl)
				.retrieve()
				.bodyToMono(Ticket[].class);
		return tickets;
	}

	@Override
	public Mono<Ticket> getTicket(Integer id) {
		String apiUrl = "http://localhost:9090/ticket/{id}";
		
		WebClient webClient = WebClient.create();
		
		Mono<Ticket> ticket = webClient.get()
				.uri(apiUrl,id)
				.retrieve()
				.bodyToMono(Ticket.class);
		return ticket;
	}

}
