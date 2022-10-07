package com.assignment.entities;

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
public class Book {

	 @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
	private int Book_ID;
	private String name;
    private String author;
    private String publication;
    private String category;
    double pages;
    double price;
}
