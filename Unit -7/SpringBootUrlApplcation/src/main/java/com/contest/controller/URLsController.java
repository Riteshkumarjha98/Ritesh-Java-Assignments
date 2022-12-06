//package com.contest.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.contest.exception.NotFoundException;
//import com.contest.model.URLs;
//import com.contest.services.URLsService;
//
//@RestController
//public class URLsController {
//	
//	@Autowired
//	private URLsService URLsServices;
//	
//	
//	@PostMapping(value = "/URLs")
//	public ResponseEntity<com.contest.model.URLs> createURLsHandler(@RequestBody URLs URLs){
//		
//		URLs createdURLs = URLsServices.createURLs(URLs);
//		
//		return new ResponseEntity<>(createdURLs,HttpStatus.CREATED);
//	
//	}
//	
//	 // Deleting URLss By Id
//	
//	 @DeleteMapping("/URLs/{Id}")
//	 public URLs deleteURLss(@PathVariable int Id) throws NotFoundException {
//		 return this.URLsServices.deleteURLss(Id);
//		 
//	 }
//	 
//	
//		
//		
//		@GetMapping("/URLs")
//		public List<URLs> getURLs() throws NotFoundException{
//		   return this.URLsServices.getAllURLsDetails();
//		}
//		
//	 
//
//}
