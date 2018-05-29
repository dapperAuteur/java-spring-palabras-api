package com.awews.form;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
	@Autowired
	private QuestionRepository questionRepository;
	
//	public List<Question> getAllQuestions(String formId) {
//		List<Question> questions = new ArrayList<>();
//		questionRepository.findByFormId(formId)
//			.forEach(questions::add);
//		System.out.println(questions);
//		return questions;
//	}
	
	public List<Question> getAllQuestions() {
		List<Question> questions = new ArrayList<>();
		questionRepository.findAll()
			.forEach(questions::add);
		System.out.println(questions);
		return questions;
	}
	
	public Question getQuestionById(String id) {
		return questionRepository.findOne(id);
	}
	
	public Question addQuestion(Question question) {
		questionRepository.save(question);
		return question;
	}
	
	public Question updateQuestion(String id, Question question) {
		return questionRepository.save(question);
	}
	
	public void deleteQuestion(String id) {
		questionRepository.delete(id);
	}

}
