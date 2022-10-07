package com.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.assignment.entities.Book;

@Repository
public interface BookDao extends JpaRepository <Book, Integer>{

}

