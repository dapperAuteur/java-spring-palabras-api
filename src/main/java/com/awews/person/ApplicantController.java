package com.awews.person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicantController {
	@Autowired
	private ApplicantService applicantService;
	
	@RequestMapping(method=RequestMethod.GET, value="/api/ver0001/applicants")
	public List<Applicant> getAllApplicants() {
		return applicantService.getAllApplicants();
	}
	
	@RequestMapping("/api/ver0001/applicants/{id}")
	public Applicant getApplicantById(@PathVariable String id) {
		return applicantService.getApplicantById(id);
	}
	
	@RequestMapping("/api/ver0001/applicants/name/{spanishSlug}")
	public Applicant getApplicantBySpanishSlug(@PathVariable String spanishSlug) {
		return applicantService.getApplicantBySpanishSlug(spanishSlug);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/api/ver0001/applicants")
	public Applicant addApplicant(@RequestBody Applicant applicant) {
		applicantService.addApplicant(applicant);
		return applicant;
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/api/ver0001/applicants/{id}")
	public Applicant updateApplicant(@RequestBody Applicant applicant, @PathVariable String id) {
		applicantService.updateApplicant(id, applicant);
		return applicant;
	}
	
//	@RequestMapping(method=RequestMethod.DELETE, value="/applicants/{id}")
//	public Course deleteApplicant(@PathVariable String id) {
//		applicantService.deleteApplicant(id);
//		Course applicant = null;
//		return applicant;
//	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/api/ver0001/applicants/{id}")
	public void deleteApplicant(@PathVariable String id) {
		applicantService.deleteApplicant(id);

	}
}
