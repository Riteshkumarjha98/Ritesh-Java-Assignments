package com.evaluation.controller;

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

import com.evaluation.entities.Address;
import com.evaluation.exception.AddressException;
import com.evaluation.exception.NotFoundException;
import com.evaluation.service.AddressServiceIntr;

@RestController
public class AddressController {

	@Autowired
	AddressServiceIntr AddressService;
	
	 
	 // Creating Address
	
	 @PostMapping("/api/Addresss")
	 public Address createNewAddress(@RequestBody Address Address) {
		 
	  return this.AddressService.createNewAddress(Address);
	  
	 }
	 
	 
	 //Get Address By Id
	  @GetMapping("/api/Addresss/{Id}")
	   public Address getAddressHandler(@PathVariable Integer Id) throws AddressException {
		   return AddressService.getAddressById(Id);
	   }
	 
	 
	 
	 
	
	 // List of Address
	 
	@GetMapping("/api/Addresss")
	public List<Address> getAddresss() throws NotFoundException{
	   return this.AddressService.getAllAddressDetails();
	}
	
	
	
   

	 //Updating Address By Id
	
	@PutMapping(value ="/api/Addresss/{Id}")
	public ResponseEntity<Address> updateAddressHandler(@PathVariable Integer Id, @RequestBody Address Address) throws NotFoundException{
		
	  Address updatedAddress = AddressService.updateAddress(Id, Address);
		
		return new ResponseEntity<Address>(updatedAddress,HttpStatus.ACCEPTED);
		
	}
	 
	 // Deleting Address By Id
	
	 @DeleteMapping("/api/Addresss/{Id}")
	 public Address deleteAddress(@PathVariable int Id) throws NotFoundException {
		 return this.AddressService.deleteAddress(Id);
		 
	 }
	 
	 @DeleteMapping("/api/Addresss")
	 public Address deleteAddress() throws NotFoundException {
		 return this.AddressService.deleteAllAddress();
		 
	 }
	
}

