package com.awews.form;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubmissionRepository extends MongoRepository<Submission, String> {
	
	public List<Submission> findByFormId (String formId);
	
	public List<Submission> findByApplicantId (String applicantId);
	
	public List<Submission> findByLanguageId (String languageId);

}
