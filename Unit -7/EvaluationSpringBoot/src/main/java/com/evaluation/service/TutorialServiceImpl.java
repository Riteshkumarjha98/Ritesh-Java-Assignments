package com.evaluation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluation.entities.Tutorial;
import com.evaluation.exception.TutorialException;
import com.evaluation.exception.NotFoundException;
import com.evaluation.repository.TutorialDao;


@Service
public class TutorialServiceImpl implements TutorialServiceIntr{
	
	@Autowired
	private TutorialDao TrDao;  //For Accessing JPA Repository
	

	@Override
	public Tutorial createNewTutorial(Tutorial Tutorial) {
		Tutorial savedTutorial = TrDao.save(Tutorial);
		   return savedTutorial;
	}
	
	

	@Override
	public List<Tutorial> getAllTutorialDetails() throws NotFoundException {
		List<Tutorial> Tutorials = TrDao.findAll();
		
		if(Tutorials.size()>0)
			return Tutorials;
		else 
			throw new TutorialException("Tutorials Not Found");
	
		
	}

	@Override
	public Tutorial deleteTutorial(Integer id) throws NotFoundException {
		
		Tutorial existingTutorial= TrDao.findById(id).orElseThrow(() -> new TutorialException("Tutorial Doesn't Exist with Id "+id));
		
		TrDao.delete(existingTutorial);
			
		 return existingTutorial;
	}

	

	@Override
	public Tutorial updateTutorial(Integer id, Tutorial Tutorial) throws NotFoundException {
	
		
		 Optional<Tutorial> foundTutorial =  TrDao.findById(id);
		 if(!foundTutorial.isPresent()) throw new NotFoundException("Tutorial not found to update with " + id);
		 
		 Tutorial updateTutorial = foundTutorial.get();
		 
	     updateTutorial.setID(Tutorial.getID());
		 updateTutorial.setTitle(Tutorial.getTitle());
		 updateTutorial.setDescription(Tutorial.getDescription());
		 updateTutorial.setPublished_status(Tutorial.getPublished_status());
         
         
		 return TrDao.save(updateTutorial);
	}
	

	

	@Override
	public Tutorial getTutorialById(Integer id) throws TutorialException{
		
	   Optional<Tutorial> opt = TrDao.findById(id);
		 
	    if(opt.isPresent()) {
	    	return opt.get();
	    }else
	    	throw new TutorialException("Tutorial Doesn't Exist With Id :" + id);
	}



	


	@Override
	public Tutorial deleteAllTutorial() throws NotFoundException {
		return null;
//		Tutorial deleteAllTutorial = TrDao.deleteAll();
//		   return deleteAllTutorial;
		
	}





	
}
