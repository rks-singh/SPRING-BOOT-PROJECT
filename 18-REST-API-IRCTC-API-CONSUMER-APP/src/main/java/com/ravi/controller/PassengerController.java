package com.ravi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ravi.request.Passenger;
import com.ravi.response.Ticket;
import com.ravi.service.PassengerService;

@Controller
public class PassengerController {

	@Autowired
	private PassengerService passengerService;

	@GetMapping("/")
	public String loadIndex(Model model) {
		model.addAttribute("passenger", new Passenger());
		return "index";
	}

	@PostMapping("/ticket")
	public String bookTicket(Passenger passenger, Model model) {
		Ticket ticket = passengerService.bookTicket(passenger);
		model.addAttribute("ticket", ticket);
		return "ticket-info";
	}

	@GetMapping("/show-ticket")
	public String getTickets(Model model) {
		List<Ticket> tickets = passengerService.getAllTickets();
		model.addAttribute("tickets", tickets);
		return "show-ticket";
	}

	@GetMapping("/search")
	public String searchTicket(Model model) {
		model.addAttribute("ticket", new Ticket());
		return "search-ticket";
	}

	@GetMapping("/search-ticket")
	public String searchTicket(@RequestParam("id") Integer id, Model model) {
		Ticket ticket = passengerService.getTicket(id);
		if (ticket != null) {
			model.addAttribute("ticket", ticket);
			return "search-ticket";
		} else {
			model.addAttribute("msg", "Ticket Not Found");
			model.addAttribute("ticket", new Ticket());
			return "search-ticket";
		}
	}
}
