package com.contest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contest.model.Followers;



@Repository
public interface FollowersRepository extends JpaRepository<Followers, Integer> {



}
