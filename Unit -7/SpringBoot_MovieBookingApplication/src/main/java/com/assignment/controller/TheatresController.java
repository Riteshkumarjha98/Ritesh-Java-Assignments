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

import com.assignment.model.Theatres;

import com.assignment.services.TheatresService;

@RestController
public class TheatresController {
	
	@Autowired
	private TheatresService TheatresServices;
	
	
	@PostMapping(value = "/Theatres")
	public ResponseEntity<com.assignment.model.Theatres> createPostHandler(@RequestBody Theatres Theatres){
		
		Theatres createdTheatres = TheatresServices.createTheatres(Theatres);
		
		return new ResponseEntity<>(createdTheatres,HttpStatus.CREATED);
	
	}
	
	 // DeletingTheatress By Id
	
	 @DeleteMapping("/Theatres/{Id}")
	 public Theatres deleteTheatres(@PathVariable int Id) throws NotFoundException {
		 return this.TheatresServices.deleteTheatres(Id);
		 
	 }
	 
		@PutMapping(value ="/Theatres/{id}")
		public ResponseEntity<Theatres> updatePostHandler(@PathVariable int id, @RequestBody Theatres Theatres) throws NotFoundException{
			
		 Theatres updatedTheatres =TheatresServices.updateTheatres(id,Theatres);
			
			return new ResponseEntity<Theatres>(updatedTheatres,HttpStatus.ACCEPTED);
			
		}
		
		

//		
		@GetMapping("/Theatress")
		public List<Theatres> getTheatress() throws NotFoundException{
			return this.TheatresServices.getAllTheatresDetails();
		}
	 

}
