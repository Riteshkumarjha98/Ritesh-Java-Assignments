package com.assignment.model;



import java.util.Date;

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
import lombok.Setter;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="movie")
public class Movie {
	
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column(nullable = false, unique = true)
    private String Name;
   
    @NotBlank
    private String Cast_Involved;
    
    @NotBlank
    private String Genre;
    
   
    private Integer duration;
    
    @NotBlank
    private String movieType;
    
    @NotBlank
    private String ScreenTpye;
    
  
    private Date DateOfRelease;
    
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "theatres_id", nullable = false)
    private Theatres theatres;
    
    

    
}

