package com.awews.form;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {
	@Autowired
	private QuestionService questionService;
	
//	@RequestMapping(method=RequestMethod.GET, value="/api/ver0001/forms/{id}/questions")
//	public List<Question> getAllQuestions(@PathVariable String id) {
//		return questionService.getAllQuestions(id);
//	}
	
	@RequestMapping(method=RequestMethod.GET, value="/api/ver0001/questions")
	public List<Question> getAllQuestions(){
		return questionService.getAllQuestions();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/api/ver0001/forms/{formId}/questions/{id}")
	public Question getQuestionById(@PathVariable String id) {
		return questionService.getQuestionById(id);
	}
	
	// not working
//	@RequestMapping(method=RequestMethod.GET, value="/api/ver0001/forms/{id}/questions/name/{questionSlug}")
//	public Question getQuestionByQuestionSlug(@PathVariable String questionSlug) {
//		return questionService.getQuestionByQuestionSlug(questionSlug);
//	}
	
	@RequestMapping(method=RequestMethod.POST, value="/api/ver0001/forms/{formId}/questions")
	public Question addQuestion(@RequestBody Question question, @PathVariable String formId) {
		question.setForm(new Form(formId, "", "", ""));
		questionService.addQuestion(question);
		return question;
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/api/ver0001/forms/{id}/questions/{id}")
	public Question updateQuestion(@RequestBody Question question, @PathVariable String formId, @PathVariable String id) {
		question.setForm(new Form(formId, "", "", ""));
		questionService.updateQuestion(id, question);
		return question;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/api/ver0001/forms/{id}/questions/{id}")
	public void deleteQuestion(@PathVariable String id) {
		questionService.deleteQuestion(id);

	}

}
