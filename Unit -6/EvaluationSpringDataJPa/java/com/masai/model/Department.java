package com.masai.model;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Department{
	
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer Departmentid;
  
  
  
  @NotEmpty(message = "Department could not be null")
  private String name;
  
 
  
  @Pattern(regexp = "[789]{1}[0-9]{9}")
	private String mobileNumber;
  
  private List<Employee>employee;
}

