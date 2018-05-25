package com.awews.form;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionTypeController {
	@Autowired
	private QuestionTypeService qtService;
	
	@RequestMapping(method=RequestMethod.GET, value="/api/ver0001/question-types")
	public List<QuestionType> getAllQuestionTypes(){
		return qtService.getAllQuestionTypes();
	}
	
	@RequestMapping("/api/ver0001/question-types/{id}")
	public QuestionType getQuestionTypeById(@PathVariable String id) {
		return qtService.getQuestionTypeById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/api/ver0001/question-types")
	public QuestionType addQuetionType(@RequestBody QuestionType qt) {
		qtService.addQuestionType(qt);
		return qt;
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/api/ver0001/question-types/{id}")
	public QuestionType updateQuestionType(@RequestBody QuestionType qt, @PathVariable String id) {
		qtService.updateQuestionType(id, qt);
		return qt;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/api/ver0001/question-types/{id}")
	public void deleteQuestionType(@PathVariable String id) {
		qtService.deleteQuestionType(id);
	}

}
