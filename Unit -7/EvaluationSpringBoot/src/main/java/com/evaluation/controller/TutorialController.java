package com.evaluation.controller;

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

import com.evaluation.entities.Tutorial;
import com.evaluation.exception.NotFoundException;
import com.evaluation.exception.TutorialException;
import com.evaluation.service.TutorialServiceIntr;

@RestController
public class TutorialController {

	@Autowired
	TutorialServiceIntr TutorialService;
	
	 
	 // Creating Tutorial
	
	 @PostMapping("/api/tutorials")
	 public Tutorial createNewTutorial(@RequestBody Tutorial Tutorial) {
		 
	  return this.TutorialService.createNewTutorial(Tutorial);
	  
	 }
	 
	 
	 //Get Tutorial By Id
	  @GetMapping("/api/tutorials/{id}")
	   public Tutorial getTutorialHandler(@PathVariable Integer id) throws TutorialException {
		   return TutorialService.getTutorialById(id);
	   }
	 
	 
	 
	 
	
	 // List of Tutorial
	 
	@GetMapping("/api/tutorials")
	public List<Tutorial> getTutorials() throws NotFoundException{
	   return this.TutorialService.getAllTutorialDetails();
	}
	
	
	
   

	 //Updating Tutorial By Id
	
	@PutMapping(value ="/api/tutorials/{id}")
	public ResponseEntity<Tutorial> updateTutorialHandler(@PathVariable Integer id, @RequestBody Tutorial Tutorial) throws NotFoundException{
		
	  Tutorial updatedTutorial = TutorialService.updateTutorial(id, Tutorial);
		
		return new ResponseEntity<Tutorial>(updatedTutorial,HttpStatus.ACCEPTED);
		
	}
	 
	 // Deleting Tutorial By Id
	
	 @DeleteMapping("/api/tutorials/{id}")
	 public Tutorial deleteTutorial(@PathVariable int id) throws NotFoundException {
		 return this.TutorialService.deleteTutorial(id);
		 
	 }
	 
	 @DeleteMapping("/api/tutorials")
	 public Tutorial deleteTutorial() throws NotFoundException {
		 return this.TutorialService.deleteAllTutorial();
		 
	 }
	
}
