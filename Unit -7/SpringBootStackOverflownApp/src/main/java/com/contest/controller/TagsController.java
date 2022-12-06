package com.contest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.contest.exception.NotFoundException;
import com.contest.model.Tags;
import com.contest.services.TagsService;

@RestController
public class TagsController {

	@Autowired
	  private TagsService TagsService;
	
	@PostMapping(value = "/tag/add")
	public ResponseEntity<Tags>  createTagsItemHandler(@RequestBody Tags TagsItem) throws NotFoundException{
	
		Tags e = TagsService.createTags(TagsItem);
		return new ResponseEntity<Tags>(e,HttpStatus.CREATED);
		
	}
	
//	@GetMapping(value = "TagsItem/{id}")
//	public ResponseEntity<Tags> findTagsItemByIdHandler(@PathVariable Integer id) throws NotFoundException{
//		
//	  Tags foundTagsItem =TagsService.findTagsById(id);
//	  return new ResponseEntity<Tags>(foundTagsItem,HttpStatus.ACCEPTED);
//	}


	 
	
	@GetMapping("/Tags")
	public List<Tags> getTagsItems() throws NotFoundException{
	   return this.TagsService.getAllTagssDetails();
	}
	
	
	 @DeleteMapping(value= "/Tags/Delete/{id}")
	 public Tags DeleteTagsItem(@PathVariable int id) throws NotFoundException {
		
		 return this.TagsService.DeleteTags(id);
		 
		 
	 }
	
}
