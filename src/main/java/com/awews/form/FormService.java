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
//		return forms.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return formRepository.findOne(id);
	}
	
//	doesn't work
	public Form getFormByFormSlug(String formSlug) {
//		return forms.stream().filter(n -> n.getFormByFormSlug().equals(formSlug)).findFirst().get();
		return formRepository.findOne(formSlug);
		
	}

	public Form addForm(Form form) {
		// TODO Auto-generated method stub
//		forms.add(form);
//		return form;
		formRepository.save(form);
		return form;
		
	}

	public Form updateForm(String id, Form form) {
		// TODO Auto-generated method stub
//		for(int i = 0; i < forms.size(); i++) {
//			Course t = forms.get(i);
//			if (t.getId().equals(id)) {
//				forms.set(i, form);
//				return form;
//			}
//		}
//		return form;
		return formRepository.save(form);
	}

//	public Course deleteForm(String id) {
//		Course form = null;
//		// TODO Auto-generated method stub
//		forms.removeIf(t -> t.getId().equals(id));
//		
//		return form;
//	}
	
	public void deleteForm(String id) {
		// TODO Auto-generated method stub
//		forms.removeIf(t -> t.getId().equals(id));
		formRepository.delete(id);
		
	}

}
