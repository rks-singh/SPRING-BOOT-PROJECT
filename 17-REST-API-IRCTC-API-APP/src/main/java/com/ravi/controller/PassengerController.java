package com.ravi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.binding.Passenger;
import com.ravi.entity.Ticket;
import com.ravi.service.TicketService;

@RestController
public class PassengerController {

	@Autowired
	private TicketService ticketService;

	@PostMapping(value = "/ticket", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger) {
		Ticket ticket = ticketService.bookTicket(passenger);
		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
	}

	@GetMapping(value = "/ticket/{id}", produces = "application/json")
	public ResponseEntity<Ticket> getTicket(@PathVariable Integer id) {

		Ticket ticket = ticketService.getTicket(id);
		return new ResponseEntity<>(ticket, HttpStatus.OK);
	}

	@GetMapping(value = "/tickets", produces = "application/json")
	public ResponseEntity<List<Ticket>> getAllTicketEntity() {
		List<Ticket> allTickets = ticketService.getAllTickets();
		return new ResponseEntity<>(allTickets, HttpStatus.OK);
	}

}
