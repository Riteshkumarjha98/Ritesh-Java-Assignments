package com.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.exception.NotFoundException;
import com.assignment.model.Movie;
import com.assignment.model.Ticket;
import com.assignment.model.Ticket;
import com.assignment.services.TicketService;

@RestController
public class TicketController {
	
	@Autowired
	private TicketService TicketServices;
	
	
	@PostMapping(value = "/Ticket")
	public ResponseEntity<com.assignment.model.Ticket> createPostHandler(@RequestBody Ticket Ticket){
		
		Ticket createdTicket = TicketServices.createTicket(Ticket);
		
		return new ResponseEntity<>(createdTicket,HttpStatus.CREATED);
	
	}
	
	 // DeletingTickets By Id
	
	 @DeleteMapping("/Ticket/{Id}")
	 public Ticket deleteTicket(@PathVariable int Id) throws NotFoundException {
		 return this.TicketServices.deleteTicket(Id);
		 
	 }
	 
		@PutMapping(value ="/Ticket/{id}")
		public ResponseEntity<Ticket> updatePostHandler(@PathVariable int id, @RequestBody Ticket Ticket) throws NotFoundException{
			
		 Ticket updatedTicket =TicketServices.updateTicket(id,Ticket);
			
			return new ResponseEntity<Ticket>(updatedTicket,HttpStatus.ACCEPTED);
			
		}
		
		

//		
		@GetMapping("/Tickets")
		public List<Ticket> getTickets() throws NotFoundException{
			return this.TicketServices.getAllTicketDetails();
		}
	 

}
