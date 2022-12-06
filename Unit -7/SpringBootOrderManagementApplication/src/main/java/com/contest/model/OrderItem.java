package com.contest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="Order_id")
public class OrderItem {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="item_id")
    private int itemId;
	
	@Column(name = "item_name")
	private String itemName;
	
	@Column(name = "item_quantity")
	private int itemQuantity;
	
    @Column(name = "item_Price")
	private String Date;

    
//    @OneToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "Product", nullable = false)
//    private Products Products;
    
    
}
