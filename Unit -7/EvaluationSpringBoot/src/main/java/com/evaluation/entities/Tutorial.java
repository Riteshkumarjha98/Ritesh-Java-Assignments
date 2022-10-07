package com.evaluation.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Tutorial {

	 @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	private String title;
    private String description;
    private String published_status;
   
}
