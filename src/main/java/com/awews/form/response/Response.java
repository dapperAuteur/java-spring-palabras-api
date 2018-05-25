package com.awews.form.response;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.awews.form.Form;
import com.awews.form.Question;
import com.awews.language.Language;
import com.awews.person.Applicant;

@Document(collection = "submissions")
public class Response {
	
	@Id
	private String id;
	private String response;
	private String placement;
	
	private Applicant applicant;
	
	private Question question;
	
	private Submission submission;
	
	public Response() {
		
	}

	/**
	 * @param id
	 * @param response
	 * @param placement
	 * @param applicant
	 * @param question
	 * @param submission
	 */
	public Response(String id, String response, String placement, Applicant applicant, Question question,
			Submission submission) {
		super();
		this.id = id;
		this.response = response;
		this.placement = placement;
		this.applicant = applicant;
		this.question = question;
		this.submission = submission;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Response [id=" + id + ", response=" + response + ", placement=" + placement + ", applicant=" + applicant
				+ ", question=" + question + ", submission=" + submission + "]";
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the response
	 */
	public String getResponse() {
		return response;
	}

	/**
	 * @param response the response to set
	 */
	public void setResponse(String response) {
		this.response = response;
	}

	/**
	 * @return the placement
	 */
	public String getPlacement() {
		return placement;
	}

	/**
	 * @param placement the placement to set
	 */
	public void setPlacement(String placement) {
		this.placement = placement;
	}

	/**
	 * @return the applicant
	 */
	public Applicant getApplicant() {
		return applicant;
	}

	/**
	 * @param applicant the applicant to set
	 */
	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}

	/**
	 * @return the question
	 */
	public Question getQuestion() {
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(Question question) {
		this.question = question;
	}

	/**
	 * @return the submission
	 */
	public Submission getSubmission() {
		return submission;
	}

	/**
	 * @param submission the submission to set
	 */
	public void setSubmission(Submission submission) {
		this.submission = submission;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applicant == null) ? 0 : applicant.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((placement == null) ? 0 : placement.hashCode());
		result = prime * result + ((question == null) ? 0 : question.hashCode());
		result = prime * result + ((response == null) ? 0 : response.hashCode());
		result = prime * result + ((submission == null) ? 0 : submission.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Response other = (Response) obj;
		if (applicant == null) {
			if (other.applicant != null)
				return false;
		} else if (!applicant.equals(other.applicant))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (placement == null) {
			if (other.placement != null)
				return false;
		} else if (!placement.equals(other.placement))
			return false;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		if (response == null) {
			if (other.response != null)
				return false;
		} else if (!response.equals(other.response))
			return false;
		if (submission == null) {
			if (other.submission != null)
				return false;
		} else if (!submission.equals(other.submission))
			return false;
		return true;
	}

}
