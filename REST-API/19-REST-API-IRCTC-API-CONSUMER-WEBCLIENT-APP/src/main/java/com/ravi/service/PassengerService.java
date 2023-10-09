package com.ravi.service;

import com.ravi.request.Passenger;
import com.ravi.response.Ticket;

import reactor.core.publisher.Mono;

public interface PassengerService {

	public Mono<Ticket> bookTicket(Passenger passenger);

	public Mono<Ticket[]> getAllTickets();

	public Mono<Ticket> getTicket(Integer id);

}
