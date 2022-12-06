package com.contest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contest.exception.NotFoundException;


import com.contest.model.Question;
import com.contest.repository.QuestionRepository;


@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionRepository QuestionRepo;

	@Override
	public Question createQuestion(Question Question) {
		
		return QuestionRepo.save(Question);
	}

	@Override
	public Question updateQuestion(Integer id , Question Question) throws NotFoundException {
		
  Optional<Question> optQuestion = QuestionRepo.findById(id);
	if(!optQuestion.isPresent())
		throw new NotFoundException("Question not found with id : " + id);
	
	   Question updatedQuestion =   optQuestion.get();
	   updatedQuestion.setTitle(Question.getTitle());
	   updatedQuestion.setDescription(Question.getDescription());
	  
	   
	   
		
		return Question;
	}

	

	@Override
	public List<Question> getAllQuestionDetails() throws NotFoundException {
		
	    List<Question> Question = QuestionRepo.findAll();
		
					if(Question.size()>0)
						return Question;
					else 
						throw new NotFoundException("Question Not Found");
			}
	

	}



	


