package com.awews.form.response;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.awews.form.Question;
import com.awews.person.Applicant;

@Repository
public interface ResponseRepository extends MongoRepository<Response, String> {
	
	public List<Response> findByApplicant (Applicant applicant);
	
	public List<Response> findByQuestion (Question question);
	
	public List<Response> findBySubmission (Submission submission);

}
