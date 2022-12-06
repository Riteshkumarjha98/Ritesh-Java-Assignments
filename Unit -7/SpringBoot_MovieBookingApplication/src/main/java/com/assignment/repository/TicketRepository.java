package com.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.model.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {



}
