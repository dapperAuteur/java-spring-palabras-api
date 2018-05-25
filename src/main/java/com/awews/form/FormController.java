package com.awews.form;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormController {
	@Autowired
	private FormService formService;
	
	@RequestMapping(method=RequestMethod.GET, value="/api/ver0001/forms")
	public List<Form> getAllForms() {
		return formService.getAllForms();
	}
	
	@RequestMapping("/api/ver0001/forms/{id}")
	public Form getFormById(@PathVariable String id) {
		return formService.getFormById(id);
	}
	
	@RequestMapping("/api/ver0001/forms/name/{formSlug}")
	public Form getFormByFormSlug(@PathVariable String formSlug) {
		return formService.getFormByFormSlug(formSlug);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/api/ver0001/forms")
	public Form addForm(@RequestBody Form form) {
		formService.addForm(form);
		return form;
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/api/ver0001/forms/{id}")
	public Form updateForm(@RequestBody Form form, @PathVariable String id) {
		formService.updateForm(id, form);
		return form;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/api/ver0001/forms/{id}")
	public void deleteForm(@PathVariable String id) {
		formService.deleteForm(id);

	}
}
