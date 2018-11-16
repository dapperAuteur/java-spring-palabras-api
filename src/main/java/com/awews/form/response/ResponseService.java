package com.awews.form.response;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awews.form.Question;
import com.awews.person.Applicant;

@Service
public class ResponseService {
	@Autowired
	private ResponseRepository responseRepository;
	
	public List<Response> getAllResponsesByApplicant(String applicantId) {
		List<Response> responses = new ArrayList<>();
		Applicant applicant = new Applicant(applicantId, "", "", "", "", "", "", "", "", "", "");
		responseRepository.findByApplicant(applicant)
			.forEach(responses::add);
		return responses;
	}
	
	public List<Response> getAllResponsesByQuestion(String questionId) {
		List<Response> responses = new ArrayList<>();
		Question question = new Question(questionId, "", "", "", "", "", null, null);
		responseRepository.findByQuestion(question)
			.forEach(responses::add);
		return responses;
	}
	
//	public List<Response> getAllResponsesBySubmission(String submissionId) {
//		List<Response> responses = new ArrayList<>();
//		responseRepository.findBySubmissionId(submissionId)
//			.forEach(responses::add);
//		return responses;
//	}
	
	public Response getResponseById(String id) {
		return responseRepository.findOne(id);
	}
	
	public Response addResponse(Response response) {
		responseRepository.save(response);
		return response;
	}
	
	public Response updateResponse(String id, Response response) {
		return responseRepository.save(response);
	}
	
	public void deleteResponse(String id) {
		responseRepository.delete(id);
	}

}
