package com.evaluation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evaluation.entities.Address;


@Repository
public interface AddressDao extends JpaRepository <Address, Integer>{

}