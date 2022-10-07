package com.evaluation.service;

import java.util.List;

import com.evaluation.entities.Tutorial;
import com.evaluation.exception.TutorialException;
import com.evaluation.exception.NotFoundException;

public interface TutorialServiceIntr {

	public Tutorial createNewTutorial(Tutorial Tutorial);
	
	public List<Tutorial> getAllTutorialDetails() throws NotFoundException;
	
	public Tutorial deleteTutorial(Integer id)  throws NotFoundException;
          
	public Tutorial getTutorialById(Integer id) throws TutorialException;
    
	Tutorial updateTutorial(Integer id, Tutorial Tutorial) throws NotFoundException;
	
	public Tutorial deleteAllTutorial() throws NotFoundException;

	




	
}