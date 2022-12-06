package com.contest.controller;

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

import com.contest.exception.NotFoundException;
import com.contest.model.Products;

import com.contest.services.ProductsService;

@RestController
public class ProductsController {
	
	@Autowired
	private ProductsService ProdServices;
	
	
	@PostMapping(value = "/Products")
	public ResponseEntity<com.contest.model.Products> createProductsHandler(@RequestBody Products Products){
		
		Products createdProducts = ProdServices.createProducts(Products);
		
		return new ResponseEntity<>(createdProducts,HttpStatus.CREATED);
	
	}
	
    //Update Products And Quanity
	@PutMapping(value ="/Products/{id}")
	public ResponseEntity<Products> updateProductsHandler(@PathVariable int id, @RequestBody Products Products) throws NotFoundException{
		
	  Products updatedProducts = ProdServices.updateProducts(id, Products);
		
		return new ResponseEntity<Products>(updatedProducts,HttpStatus.ACCEPTED);
		
	}
	
	
	
	
	
	 // Deleting Products By Id
	
	 @DeleteMapping("/Products/{Id}")
	 public Products CancelProductss(@PathVariable int Id) throws NotFoundException {
		 return this.ProdServices.CancelProductss(Id);
		 
	 }
	 
		
		@GetMapping("/Products")
		public List<Products> getProducts() throws NotFoundException{
		   return this.ProdServices.getAllProductsDetails();
		}
		
	 

}
