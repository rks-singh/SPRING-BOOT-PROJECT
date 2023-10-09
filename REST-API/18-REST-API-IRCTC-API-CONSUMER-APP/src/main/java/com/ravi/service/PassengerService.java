package com.ravi.service;

import java.util.List;

import com.ravi.request.Passenger;
import com.ravi.response.Ticket;

public interface PassengerService {

	public Ticket bookTicket(Passenger passenger);

	public List<Ticket> getAllTickets();

	public Ticket getTicket(Integer id);

}
