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
import com.masai.model.Order;
import com.masai.service.OrderService;


@RestController
public class OrderController {
	
	@Autowired
  private OrderService OrdService;
	


	@PostMapping(value = "/Order")
	public ResponseEntity<Order>  createOrderHandler(@RequestBody Order Order) throws NotFoundException{
	
		Order e = OrdService.createOrder(Order);
		return new ResponseEntity<Order>(e,HttpStatus.CREATED);
		
	}
	
	@GetMapping(value = "Order/{id}")
	public ResponseEntity<Order> findOrderByIdHandler(@PathVariable Integer id) throws NotFoundException{
		
	  Order foundOrder = OrdService.findOrderById(id);
	  return new ResponseEntity<Order>(foundOrder,HttpStatus.ACCEPTED);
	}


	 
	
	@GetMapping("/Orders")
	public List<Order> getOrders() throws NotFoundException{
	   return this.OrdService.getAllOrdersDetails();
	}
	
	
	 @DeleteMapping(value= "/Order/{id}")
	 public Order BlockOrder(@PathVariable int id) throws NotFoundException {
	
		 return this.OrdService.CancelOrder(id);
		 
		 
	 }
	
}
