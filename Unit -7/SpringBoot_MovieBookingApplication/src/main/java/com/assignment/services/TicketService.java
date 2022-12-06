package com.assignment.services;


import java.util.List;

import com.assignment.exception.NotFoundException;

import com.assignment.model.Ticket;

public interface TicketService {
   
	public Ticket createTicket(Ticket Ticket);
	
	public Ticket updateTicket(Integer id,Ticket Ticket) throws NotFoundException;
	
	public Ticket deleteTicket(Integer id)  throws NotFoundException;
	
	public List<Ticket> getAllTicketDetails() throws NotFoundException;
}
