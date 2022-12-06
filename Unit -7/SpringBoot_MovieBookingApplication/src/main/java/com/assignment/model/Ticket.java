package com.assignment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Ticket {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String Movie_Name;
	
    private String Category;
	
	private String rowAndcolumn;
	
	private String price;
	
	
}
