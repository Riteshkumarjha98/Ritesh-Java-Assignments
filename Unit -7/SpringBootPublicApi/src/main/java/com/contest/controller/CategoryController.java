package com.contest.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.contest.exception.NotFoundException;
import com.contest.model.Category;
import com.contest.services.CategoryService;

@RestController
public class CategoryController {
	
  @Autowired
  private CategoryService CatService;
	

	@PostMapping(value = "/Category")
	public ResponseEntity<Category>  createCategoryHandler(@RequestBody Category Category) throws NotFoundException{
	
		Category e = CatService.createCategory(Category);
		return new ResponseEntity<Category>(e,HttpStatus.CREATED);
		
	}
	
	@GetMapping(value = "Category/{id}")
	public ResponseEntity<Category> findCategoryByIdHandler(@PathVariable Integer id) throws NotFoundException{
		
	  Category foundCategory =	CatService.findCategoryById(id);
	  return new ResponseEntity<Category>(foundCategory,HttpStatus.ACCEPTED);
	}


	 
	
	@GetMapping("/Categorys")
	public List<Category> getCategorys() throws NotFoundException{
		
	   return this.CatService.getAllCategorysDetails();
	}
	
	
	
}
