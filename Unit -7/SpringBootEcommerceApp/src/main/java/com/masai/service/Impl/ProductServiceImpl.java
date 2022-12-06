package com.masai.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.NotFoundException;
import com.masai.exception.ProductException;
import com.masai.model.Product;

import com.masai.repository.ProductRepository;

import com.masai.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService{


    @Autowired
	private ProductRepository ProductRepo;
	 
	 
	@Override
	public Product createProduct(Product Product) throws NotFoundException {
		// TODO Auto-generated method stub
		return ProductRepo.save(Product);
	}

	@Override
	public Product findProductById(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		
	   Optional<Product> optProduct = ProductRepo.findById(id);
	   if(!optProduct.isPresent())
		   throw new NotFoundException("Product not Found with id : " + id);
		return optProduct.get();
	}


	@Override
	public Product getProductsById(Integer id) throws NotFoundException {
		   Optional<Product> opt = ProductRepo.findById(id);
			 
		    if(opt.isPresent()) {
		    	return opt.get();
		    }
		    else
		    	
		    	throw new NotFoundException("Products Doesn't Exist With Id :" + id);
		}


	@Override
	public List<Product> getAllProductsDetails() throws NotFoundException {
	    List<Product> Products = ProductRepo.findAll();
		
				if(Products.size()>0)
					return Products;
				else 
				    throw new NotFoundException("Products Not Found");
		}


	@Override
	public Product CancelProduct(Integer id) throws NotFoundException {
     Product existingProduct = ProductRepo.findById(id).orElseThrow(() -> new ProductException("Product Doesn't Exist with Id "+id));
		 ProductRepo.delete(existingProduct);
			
		    return existingProduct;
	}



	
	

}
