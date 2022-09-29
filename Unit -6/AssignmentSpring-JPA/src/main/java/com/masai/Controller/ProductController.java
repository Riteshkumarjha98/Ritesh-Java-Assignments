package com.masai.Controller;

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

import com.masai.exception.ProductException;
import com.masai.model.Product;
import com.masai.services.ProductService;

@RestController
public class ProductController {
	
	@Autowired
  private ProductService pService;   
	

	
   @PostMapping("/products")
  public Product saveProductHandler(@RequestBody Product product) {
	  return pService.saveProduct(product);
  }
   
   
	
   @GetMapping("/products/{id}")
   public Product getproductHandler(@PathVariable Integer id) throws ProductException {
	   return pService.getProductById(id);
   }
   
   
   
   @GetMapping("/products")
   public ResponseEntity<List<Product>> getAllProductsHandler() throws ProductException{
	   
	 List<Product> products =  pService.getAllProductDetaisl();
	 return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
	   
   }
   
   
  
   
	@PutMapping("/products")
	public ResponseEntity<Product> updateProductHandler(@RequestBody Product product) throws ProductException {
		
	Product updatedProduct = pService.updateProduct(product);

		return new ResponseEntity<Product>(updatedProduct,HttpStatus.ACCEPTED);

	}
   
 
	
	@DeleteMapping("products/{id}")
	public Product deleteProductById(@PathVariable("id") Integer id) throws ProductException  {
		
		return pService.deleteProductById(id);
	}
	
	
   


}

