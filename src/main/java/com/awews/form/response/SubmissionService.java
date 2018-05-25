package com.awews.form.response;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awews.form.response.Submission;

@Service
public class SubmissionService {
	@Autowired
	private SubmissionRepository submissionRepository;
	
	public List<Submission> getAllSubmissionsByApplicant(String applicantId) {
		List<Submission> submissions = new ArrayList<>();
		submissionRepository.findByApplicantId(applicantId)
			.forEach(submissions::add);
		return submissions;
	}
	
	public List<Submission> getAllSubmissionsByForm(String formId) {
		List<Submission> submissions = new ArrayList<>();
		submissionRepository.findByFormId(formId)
			.forEach(submissions::add);
		return submissions;
	}
	
	public List<Submission> getAllSubmissionsByLanguage(String languageId) {
		List<Submission> submissions = new ArrayList<>();
		submissionRepository.findByLanguageId(languageId)
			.forEach(submissions::add);
		return submissions;
	}
	
	public Submission getSubmissionById(String id) {
		return submissionRepository.findOne(id);
	}
	
	public Submission addSubmission(Submission submission) {
		submissionRepository.save(submission);
		return submission;
	}
	
	public Submission updateSubmission(String id, Submission submission) {
		return submissionRepository.save(submission);
	}
	
	public void deleteSubmission(String id) {
		submissionRepository.delete(id);
	}

}
