package com.awews.form;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FormService {
	@Autowired
	private FormRepository formRepository;
	
	public List<Form> getAllForms() {
		List<Form> forms = new ArrayList<>();
		formRepository.findAll()
			.forEach(forms::add);
		return forms;
	}
	
	public Form getFormById(String id) {
		return formRepository.findOne(id);
	}
	
//	doesn't work
	public Form getFormByFormSlug(String formSlug) {
		return formRepository.findOne(formSlug);
		
	}

	public Form addForm(Form form) {
		// TODO Auto-generated method stub
		formRepository.save(form);
		return form;
		
	}

	public Form updateForm(String id, Form form) {
		// TODO Auto-generated method stub
		return formRepository.save(form);
	}
	
	public void deleteForm(String id) {
		// TODO Auto-generated method stub
		formRepository.delete(id);	
	}
}
