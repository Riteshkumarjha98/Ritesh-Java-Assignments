package com.masai.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "firstName")
	private String First_name;
	
	@Column(name = "LastName")
	private String Last_name;
	
	@Column(name = "email")
	private String  email;
	
	@Column(name = "phone_number")
	private String phone_number;
	
	@Column(name = "yearly_salary")
	private double yearly_salary;
	
	@JsonBackReference
   @OneToOne(cascade = CascadeType.ALL)
   private	Manager manager;
	
	
}
