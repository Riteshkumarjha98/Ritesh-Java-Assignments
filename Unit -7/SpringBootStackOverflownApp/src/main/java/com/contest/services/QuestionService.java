package com.contest.services;


import java.util.List;

import com.contest.exception.NotFoundException;
import com.contest.model.Question;

public interface QuestionService {
   
	public Question createQuestion(Question Question);
	
	public Question updateQuestion(Integer id, Question Question) throws NotFoundException;
	
	
	
	public List<Question> getAllQuestionDetails() throws NotFoundException;
}
