package payload;

import lombok.Data;



import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;




@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CommentDto {
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    private String name;
	    private String email;
	    private String body;

	  
}



