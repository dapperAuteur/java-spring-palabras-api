package com.awews.form.response;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.awews.form.response.Submission;

@Repository
public interface SubmissionRepository extends MongoRepository<Submission, String> {
	
	public List<Submission> findByFormId (String formId);
	
	public List<Submission> findByApplicantId (String applicantId);
	
	public List<Submission> findByLanguageId (String languageId);

}
