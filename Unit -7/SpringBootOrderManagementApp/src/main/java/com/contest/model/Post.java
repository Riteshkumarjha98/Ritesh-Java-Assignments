package com.contest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
//	@NotEmpty(message = "Please provide Title")
	private String title;
	
//	@NotEmpty(message = "Please provide Description")
	private String description;
	
	private String location;
	private String Feeling_Activity;
	private String Date;
	

}
