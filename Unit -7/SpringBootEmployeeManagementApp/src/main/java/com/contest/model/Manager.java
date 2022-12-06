package com.contest.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
@Table(name="manager")
public class Manager {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Manager_id")
    private int Id;
	
//	@Column(name = "FirstName")
	private String FirstName;
	
//	@Column(name = "LastName")
	private int LastName;
	
//    @Column(name = "email")
	private String Email;
    
//    @Column(name = "phone_number")
    private String phone_number;
    
	
    
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "manager")
    private Employee employee;
	
}
