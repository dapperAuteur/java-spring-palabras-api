package com.awews.form.response;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponseRepository extends MongoRepository<Response, String> {
	
	public List<Response> findByApplicantId (String applicantId);
	
	public List<Response> findByQuestionId (String questionId);
	
	public List<Response> findBySubmissionId (String submissionId);

}
