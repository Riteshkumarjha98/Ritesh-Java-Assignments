package com.masai.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.masai.exception.NotFoundException;
import com.masai.model.Product;
import com.masai.service.ProductService;


@RestController
public class ProductController {
	
	@Autowired
  private ProductService ProdService;
	


	@PostMapping(value = "/Product")
	public ResponseEntity<Product>  createProductHandler(@RequestBody Product Product) throws NotFoundException{
	
		Product e = ProdService.createProduct(Product);
		return new ResponseEntity<Product>(e,HttpStatus.CREATED);
		
	}
	
	@GetMapping(value = "Product/{id}")
	public ResponseEntity<Product> findProductByIdHandler(@PathVariable Integer id) throws NotFoundException{
		
	  Product foundProduct = ProdService.findProductById(id);
	  return new ResponseEntity<Product>(foundProduct,HttpStatus.ACCEPTED);
	}


	 
	
	@GetMapping("/Products")
	public List<Product> getProducts() throws NotFoundException{
	   return this.ProdService.getAllProductsDetails();
	}
	
	
	 @DeleteMapping(value= "/Product/{id}")
	 public Product BlockProduct(@PathVariable int id) throws NotFoundException {
	
		 return this.ProdService.CancelProduct(id);
		 
		 
	 }
	
}
