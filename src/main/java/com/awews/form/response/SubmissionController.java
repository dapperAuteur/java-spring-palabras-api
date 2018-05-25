package com.awews.form.response;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.awews.form.response.Submission;
import com.awews.person.Applicant;

@RestController
public class SubmissionController {
	@Autowired
	private SubmissionService submissionService;
	
	@RequestMapping(method=RequestMethod.GET, value="/api/ver0001/applicants/{id}/submissions")
	public List<Submission> getAllSubmissionsByApplicant(@PathVariable String id) {
		return submissionService.getAllSubmissionsByApplicant(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/api/ver0001/forms/{id}/submissions")
	public List<Submission> getAllSubmissionsByForm(@PathVariable String id) {
		return submissionService.getAllSubmissionsByForm(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/api/ver0001/languages/{id}/submissions")
	public List<Submission> getAllSubmissionsByLanguage(@PathVariable String id) {
		return submissionService.getAllSubmissionsByLanguage(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/api/ver0001/applicants/{applicantId}/submissions/{id}")
	public Submission getSubmissionById(@PathVariable String id) {
		return submissionService.getSubmissionById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/api/ver0001/applicants/{applicantId}/submissions")
	public Submission addSubmission(@RequestBody Submission submission, @PathVariable String applicantId) {
		submission.setApplicant(new Applicant(applicantId, "", "", "", "", "", "", "", "", "", ""));
		submissionService.addSubmission(submission);
		return submission;
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/api/ver0001/applicants/{applicantId}/submissions/{id}")
	public Submission updateSubmission(@RequestBody Submission submission, @PathVariable String applicantId, @PathVariable String id) {
		submission.setApplicant(new Applicant(applicantId, "", "", "", "", "", "", "", "", "", ""));
		submissionService.updateSubmission(id, submission);
		return submission;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/api/ver0001/applicants/{applicantId}/submissions/{id}")
	public void deleteSubmission(@PathVariable String id) {
		submissionService.deleteSubmission(id);

	}

}
