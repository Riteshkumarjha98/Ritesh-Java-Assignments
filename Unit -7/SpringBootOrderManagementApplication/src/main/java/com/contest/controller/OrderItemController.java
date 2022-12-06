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
import com.contest.model.OrderItem;
import com.contest.services.OrderItemService;

@RestController
public class OrderItemController {

	@Autowired
	  private OrderItemService OrderService;
	
	@PostMapping(value = "/OrderItem")
	public ResponseEntity<OrderItem>  createOrderItemHandler(@RequestBody OrderItem OrderItem) throws NotFoundException{
	
		OrderItem e = OrderService.createOrders(OrderItem);
		return new ResponseEntity<OrderItem>(e,HttpStatus.CREATED);
		
	}
	
	@GetMapping(value = "OrderItem/{id}")
	public ResponseEntity<OrderItem> findOrderItemByIdHandler(@PathVariable Integer id) throws NotFoundException{
		
	  OrderItem foundOrderItem =OrderService.findOrdersById(id);
	  return new ResponseEntity<OrderItem>(foundOrderItem,HttpStatus.ACCEPTED);
	}


	 
	
	@GetMapping("/OrderItems")
	public List<OrderItem> getOrderItems() throws NotFoundException{
	   return this.OrderService.getAllOrderssDetails();
	}
	
	
	 @DeleteMapping(value= "/OrderItem/{id}")
	 public OrderItem CancelOrderItem(@PathVariable int id) throws NotFoundException {
		
		 return this.OrderService.CancelOrders(id);
		 
		 
	 }
	
}
