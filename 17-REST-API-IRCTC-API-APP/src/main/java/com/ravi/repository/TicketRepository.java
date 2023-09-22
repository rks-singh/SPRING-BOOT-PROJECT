package com.ravi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
