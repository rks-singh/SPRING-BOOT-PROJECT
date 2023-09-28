package com.ravi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravi.binding.Passenger;
import com.ravi.entity.Ticket;
import com.ravi.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepository ticketRepository;

	@Override
	public Ticket bookTicket(Passenger passenger) {

		Ticket ticket = new Ticket();
		BeanUtils.copyProperties(passenger, ticket);
		ticket.setPrice(15000.00d);
		ticket.setTstatus("CONFIRM");

		ticket = ticketRepository.save(ticket);
		return ticket;
	}

	@Override
	public Ticket getTicket(Integer ticketNum) {

		Optional<Ticket> findById = ticketRepository.findById(ticketNum);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Ticket> getAllTickets() {
		return ticketRepository.findAll();
	}

}
