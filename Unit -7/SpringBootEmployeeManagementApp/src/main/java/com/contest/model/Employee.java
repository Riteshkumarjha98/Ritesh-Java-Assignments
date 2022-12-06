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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
@Table(name="Employee_id")
public class Employee {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employee_id")
    private int Id;
//	
//	@Column(name = "FirstName")
	private String FirstName;
	
//	@Column(name = "LastName")
	private int LastName;
	
    @Column(name = "email")
	private String Email;
    
//    @Column(name = "phone_number")
    private String phone_number;
    
//    @Column(name = "slary")
    private String salary;
    
    
   
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reporting_Manager_Id;

    
//    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//    @JoinColumn(name = "Manager", nullable = false)
//    private Manager manager;
//    
    
    @JsonBackReference
    @OneToOne(cascade = CascadeType.ALL)
    private  Manager manager;
}
