package com.evaluation.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Address")
public class Address {

	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;

	@Column(name = "street", nullable = false)
	private String street;
	
	@Column(name = "city", nullable = false)
	private String city;
	
	@Column(name = "state", nullable = false)
	private String state;
	
	
	@Column(name = "country", nullable = false)
	private String country;
	
	
	 @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "Employee_id", nullable = false)
	    private Employee Employee;
	
	
}
