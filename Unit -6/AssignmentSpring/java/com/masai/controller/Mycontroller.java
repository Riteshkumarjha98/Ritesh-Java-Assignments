package com.masai.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entities.Product;
import com.masai.services.ProductService;

@RestController 
public class Mycontroller {
	
	@Autowired
	private ProductService productService;
	

	@GetMapping("/home")
	public String home() {
		return "This is home page";
	}
  
	// Get The All Products
	
	@GetMapping("/products")
	public List<Product> getProducts(){
	return this.productService.getProducts();
	}
	
	//Get single Product By Id
	
	    @GetMapping("/products/{id}")
	    public Product getProduct(@PathVariable int id) {
		return this.productService.getProduct(id);

	 }
	 
	 // Adding product
	 @PostMapping("/products")
	 public Product addProduct(@RequestBody Product product) {
		 
	  return this.productService.addProduct(product);
	  
	 }
	
    //Updating Product By Id
	 @PutMapping(value = "/updateproduct/{id}")
	 public Product updateProduct(@RequestBody Product product,@PathVariable int id) {
		 return this.productService.updateProduct(id);
	 }
	 
	 // Deleting Product By Id
	 @DeleteMapping("/products/{id}")
	 public Product deleteProduct(@PathVariable int id) {
		 return this.productService.deleteProduct(id);
		 
	 }
	 
}