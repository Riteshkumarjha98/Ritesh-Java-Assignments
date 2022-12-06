package com.contest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="product")
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
    @Column(nullable = false, unique = true)
	private String Name;
	
    private int quanity;
	
	@NotBlank
	private String ManufacturingDate;
	
	@NotBlank
	private String ExpireDate;
	
	@NotBlank
	private String Price;

	@NotBlank
	private String description;
	
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "Order_id", nullable = false)
	    private OrderItem OrdersItem;
	
}
