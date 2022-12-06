package com.contest.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Table(name="Question")
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "question_id")
	private Integer id;
	
	@NotEmpty(message = "Please provide Title")
	private String title;
	
	@NotEmpty(message = "Please provide Description")
	private String description;
	
	
//	    @OneToMany(cascade = CascadeType.ALL)
//	    @JoinColumn(name = "question_id", referencedColumnName = "question_id")
//	    private List<Tags> tags;

}
