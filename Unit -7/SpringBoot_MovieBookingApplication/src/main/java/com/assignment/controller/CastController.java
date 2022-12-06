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

import com.assignment.model.Cast;

import com.assignment.services.CastService;

@RestController
public class CastController {
	
	@Autowired
	private CastService CastServices;
	
	
	@PostMapping(value = "/Cast")
	public ResponseEntity<com.assignment.model.Cast> createPostHandler(@RequestBody Cast Cast){
		
		Cast createdCast = CastServices.createCast(Cast);
		
		return new ResponseEntity<>(createdCast,HttpStatus.CREATED);
	
	}
	
	 // DeletingCasts By Id
	
	 @DeleteMapping("/Cast/{Id}")
	 public Cast deleteCast(@PathVariable int Id) throws NotFoundException {
		 return this.CastServices.deleteCast(Id);
		 
	 }
	 
		@PutMapping(value ="/Cast/{id}")
		public ResponseEntity<Cast> updatePostHandler(@PathVariable int id, @RequestBody Cast Cast) throws NotFoundException{
			
		 Cast updatedCast =CastServices.updateCast(id,Cast);
			
			return new ResponseEntity<Cast>(updatedCast,HttpStatus.ACCEPTED);
			
		}
		
		

//		
		@GetMapping("/Casts")
		public List<Cast> getCasts() throws NotFoundException{
			return this.CastServices.getAllCastDetails();
		}
	 

}
