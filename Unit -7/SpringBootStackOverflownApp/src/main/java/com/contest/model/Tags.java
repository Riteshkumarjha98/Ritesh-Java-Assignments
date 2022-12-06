package com.contest.model;


import java.util.Set;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
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
@Table(name = "tags")
public class Tags {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tags")
	private Integer id;
	
	@NotEmpty(message = "Please provide Title")
	private String title;
	
	@NotEmpty(message = "Please provide Description")
	private String description;
    
	
//	  @Column(name = "question_id")
//	    private Integer question_id;
}
