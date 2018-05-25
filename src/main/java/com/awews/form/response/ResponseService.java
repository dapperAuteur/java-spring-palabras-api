package com.awews.form.response;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResponseService {
	@Autowired
	private ResponseRepository responseRepository;
	
	public List<Response> getAllResponsesByApplicant(String applicantId) {
		List<Response> responses = new ArrayList<>();
		responseRepository.findByApplicantId(applicantId)
			.forEach(responses::add);
		return responses;
	}
	
	public List<Response> getAllResponsesByQuestion(String questionId) {
		List<Response> responses = new ArrayList<>();
		responseRepository.findByQuestionId(questionId)
			.forEach(responses::add);
		return responses;
	}
	
	public List<Response> getAllResponsesBySubmission(String submissionId) {
		List<Response> responses = new ArrayList<>();
		responseRepository.findBySubmissionId(submissionId)
			.forEach(responses::add);
		return responses;
	}
	
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
