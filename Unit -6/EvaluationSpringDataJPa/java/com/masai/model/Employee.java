package com.masai.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	
	@NotEmpty(message = "Name could not be null")
	private String name;
  
	@Pattern(regexp = "[789]{1}[0-9]{9}")
	private String mobileNumber;
	
	private String email;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Department department;
	
	
}
