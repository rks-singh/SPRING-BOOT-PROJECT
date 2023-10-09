package com.ravi.service;

import java.util.List;

import com.ravi.binding.Passenger;
import com.ravi.entity.Ticket;

public interface TicketService {
	
	public Ticket bookTicket(Passenger passenger);
	public Ticket getTicket(Integer ticketNum);
	public List<Ticket> getAllTickets();

}
