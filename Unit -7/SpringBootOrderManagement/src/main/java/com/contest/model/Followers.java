package com.contest.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Followers {
	
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column(nullable = false, unique = true)
    private String name;
   
    private String Email;
    
    private String Mobile;
}
