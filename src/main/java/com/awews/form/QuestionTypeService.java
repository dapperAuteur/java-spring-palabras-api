package com.awews.form;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionTypeService {
	@Autowired
	private QuestionTypeRepository qtRepository;
	
	public List<QuestionType> getAllQuestionTypes() {
		List<QuestionType> questionTypes = new ArrayList<>();
		qtRepository.findAll()
			.forEach(questionTypes::add);
		return questionTypes;
	}
	
	public QuestionType getQuestionTypeById(String id) {
		return qtRepository.findOne(id);
	}
	
	public QuestionType addQuestionType(QuestionType qt) {
		qtRepository.save(qt);
		return qt;
	}
	
	public QuestionType updateQuestionType(String id, QuestionType qt) {
		return qtRepository.save(qt);
	}
	
	public void deleteQuestionType(String id) {
		qtRepository.delete(id);
	}

}
