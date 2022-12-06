package com.contest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contest.exception.NotFoundException;


import com.contest.model.Question;
import com.contest.repository.QuestionRepository;
import com.contest.exception.QuestionException;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionRepository QuestionRepo;

	@Override
	public Question createQuestion(Question Question) {
		// TODO Auto-generated method stub
		return QuestionRepo.save(Question);
	}

	@Override
	public Question updateQuestion(Integer id , Question Question) throws NotFoundException {
		// TODO Auto-generated method stub
		
	Optional<Question> optQuestion = QuestionRepo.findById(id);
	if(!optQuestion.isPresent())
		throw new NotFoundException("Question not found with id : " + id);
	
	   Question updatedQuestion =   optQuestion.get();
	   updatedQuestion.setTitle(Question.getTitle());
	   updatedQuestion.setDescription(Question.getDescription());
	   updatedQuestion.setLocation(Question.getLocation());
	   updatedQuestion.setFeeling_Activity(Question.getFeeling_Activity());
	   updatedQuestion.setDate(Question.getDate());
	   
	   
		
		return Question;
	}

	@Override
	public Question deleteQuestions(Integer id) throws NotFoundException {

		Question existingQuestions= QuestionRepo.findById(id).orElseThrow(() -> new QuestionException("Questions Doesn't Exist with Id "+id));
		
		QuestionRepo.delete(existingQuestions);
			
		 return existingQuestions;
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



	


