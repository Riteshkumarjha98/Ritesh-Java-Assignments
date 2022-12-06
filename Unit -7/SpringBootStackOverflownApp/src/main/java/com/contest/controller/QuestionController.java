package com.contest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.contest.exception.NotFoundException;
import com.contest.model.Question;
import com.contest.services.QuestionService;

@RestController
public class QuestionController {
	
	@Autowired
	private QuestionService QuestionServices;
	
	
	@PostMapping(value = "/question/create")
	public ResponseEntity<com.contest.model.Question> createQuestionHandler(@RequestBody Question Question){
		
		Question createdQuestion = QuestionServices.createQuestion(Question);
		
		return new ResponseEntity<>(createdQuestion,HttpStatus.CREATED);
	
	}
	
	
	 
		@PatchMapping(value ="/Question/edit/{id}")
		public ResponseEntity<Question> updateQuestionHandler(@PathVariable int id, @RequestBody Question Question) throws NotFoundException{
			
		 Question updatedQuestion = QuestionServices.updateQuestion(id, Question);
			
		 return new ResponseEntity<Question>(updatedQuestion,HttpStatus.ACCEPTED);
			
		}
		
		
		
		@GetMapping("/Question")
		public List<Question> getQuestion() throws NotFoundException{
			
		   return this.QuestionServices.getAllQuestionDetails();
		}
		
	 

}
