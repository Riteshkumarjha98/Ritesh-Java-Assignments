package com.assignment.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.exception.NotFoundException;
import com.assignment.exception.TicketException;

import com.assignment.model.Ticket;
import com.assignment.repository.TicketRepository;


@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepository TicketRepo;

	@Override
	public Ticket createTicket(Ticket Ticket) {
		// TODO Auto-generated method stub
		return TicketRepo.save(Ticket);
	}

	@Override
	public Ticket updateTicket(Integer id , Ticket Ticket) throws NotFoundException {
		// TODO Auto-generated method stub
		
	Optional<Ticket> optTicket = TicketRepo.findById(id);
	if(!optTicket.isPresent())
		throw new NotFoundException("Ticket not found with id : " + id);
	
	  Ticket updatedTicket = optTicket.get();
	  
	   updatedTicket.setId(Ticket.getId());
	   updatedTicket.setCategory(Ticket.getCategory());
	   updatedTicket.setRowAndcolumn(Ticket.getRowAndcolumn());
	   updatedTicket.setPrice(Ticket.getPrice());
	  
	  
	  return Ticket;
	}

	@Override
	public Ticket deleteTicket(Integer id) throws NotFoundException {


		
	Ticket existingTickets = TicketRepo.findById(id).orElseThrow(() -> new TicketException("Ticket Doesn't Exist with Id "+id));
		
	        TicketRepo.delete(existingTickets);
			
		       return existingTickets;
	}
	
	

	@Override
	public List<Ticket> getAllTicketDetails() throws NotFoundException {
		
	    List<Ticket>Ticket =TicketRepo.findAll();
		
					if(Ticket.size()>0)
						return Ticket;
					else 
						throw new NotFoundException("Ticket Not Found");
			}
	

	}



	


