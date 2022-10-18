package com.contest.entities;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Tasks {
  
    private int id;
	private String title;
	private String description;
    private boolean  Status;
	private String  priority;
    private int assigned_employee_id;
}
