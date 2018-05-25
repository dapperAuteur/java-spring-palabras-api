package com.awews.form.response;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.awews.person.Applicant;

@RestController
public class ResponseController {
	@Autowired
	private ResponseService responseService;
	
	@RequestMapping(method=RequestMethod.GET, value="/api/ver0001/applicants/{id}/responses")
	public List<Response> getAllResponsesByApplicant(@PathVariable String id) {
		return responseService.getAllResponsesByApplicant(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/api/ver0001/questions/{id}/responses")
	public List<Response> getAllResponsesByQuestion(@PathVariable String id) {
		return responseService.getAllResponsesByQuestion(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/api/ver0001/submissions/{id}/responses")
	public List<Response> getAllResponsesBySubmission(@PathVariable String id) {
		return responseService.getAllResponsesBySubmission(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/api/ver0001/applicants/{applicantId}/responses/{id}")
	public Response getResponseById(@PathVariable String id) {
		return responseService.getResponseById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/api/ver0001/applicants/{applicantId}/responses")
	public Response addResponse(@RequestBody Response response, @PathVariable String applicantId) {
		response.setApplicant(new Applicant(applicantId, "", "", "", "", "", "", "", "", "", ""));
		responseService.addResponse(response);
		return response;
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/api/ver0001/applicants/{applicantId}/responses/{id}")
	public Response updateResponse(@RequestBody Response response, @PathVariable String applicantId, @PathVariable String id) {
		response.setApplicant(new Applicant(applicantId, "", "", "", "", "", "", "", "", "", ""));
		responseService.updateResponse(id, response);
		return response;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/api/ver0001/applicants/{applicantId}/responses/{id}")
	public void deleteResponse(@PathVariable String id) {
		responseService.deleteResponse(id);

	}

}
