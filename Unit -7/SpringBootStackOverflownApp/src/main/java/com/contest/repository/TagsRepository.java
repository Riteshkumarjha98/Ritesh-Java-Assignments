package com.contest.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.contest.model.Tags;


@Repository
public interface TagsRepository extends JpaRepository<Tags, Integer>{

	
	
}
