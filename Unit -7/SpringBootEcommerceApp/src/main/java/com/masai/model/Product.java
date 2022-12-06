package com.masai.model;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Product {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
     @NotNull(message = "Product name is required.")
     @Basic(optional = false)
	 private String name;

	 private Double price;
	
	
	@Column(name = "productCategory")
	private String productCategory;

//	   @JsonBackReference
//	   @OneToOne(cascade = CascadeType.ALL)
//	   private	Product product;
}
