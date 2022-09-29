package com.assignment.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.model.Product;

//@Controller
@RestController
@RequestMapping("/Productapp")
public class ProductController {

	//@GetMapping(value = "/product" , produces = MediaType.APPLICATION_JSON_VALUE)
	@GetMapping("/product")
	public Product getProduct() {
		
		Product product = new Product();
		product.setId(1);
		product.setName("Pulsar");
		product.setPrice(75000);
		product.setBrand("Bajaj");
		product.setCategory("Two-Wheeler");
		product.setRegistration_number(800020);
		product.setManufacturer_id(2022);
		
		return product;
		
		}
	
	@GetMapping(value ="/products")
	public List<Product> getProducts(){
		List<Product> product = new ArrayList<Product>();
		
		product.add(new Product (10,"Boolet",1500000,"Royal_Enfield","Two_Wheller",8000020,2022));
		
		
		return product;
	}
}
