package com.masai.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Order {
	
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	
	private String OrderType;
	
	private String date;
	
}