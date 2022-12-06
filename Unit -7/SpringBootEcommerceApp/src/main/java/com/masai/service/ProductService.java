package com.masai.service;

import java.util.List;

import com.masai.exception.NotFoundException;
import com.masai.model.Order;
import com.masai.model.Product;


public interface ProductService {
	
public Product createProduct(Product Product) throws NotFoundException;
	
	public Product findProductById(Integer id) throws NotFoundException;
	
	public Product getProductsById(Integer id) throws NotFoundException;
	
	public List<Product> getAllProductsDetails() throws NotFoundException;

	public Product CancelProduct(Integer id)  throws NotFoundException;
}
