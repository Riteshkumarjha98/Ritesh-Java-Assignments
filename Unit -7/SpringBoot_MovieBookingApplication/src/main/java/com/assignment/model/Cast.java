package com.assignment.model;

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
public class Cast {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
//	@NotBlank
    private String leadActor;
    
//    @NotBlank
    private String leadActress;
	
//	@NotBlank
	private String leadNegativeRole;
	
//	@NotBlank
	private String Directr;
//	
//	@NotBlank
	private String Producer;
	
	
	
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "movie_id", nullable = false)
//    private Movie movie;

}
