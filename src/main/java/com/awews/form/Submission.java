package com.awews.form;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.awews.language.Language;
import com.awews.person.Applicant;

@Document(collection = "submissions")
public class Submission {
	
	@Id
	private String id;
	private Boolean complete;
	
	private Form form;
	
	private Applicant applicant;
	
	private Language language;
	
	public Submission() {
		
	}

	/**
	 * @param id
	 * @param complete
	 * @param form
	 * @param applicant
	 * @param language
	 */
	public Submission(String id, Boolean complete, Form form, Applicant applicant, Language language) {
		super();
		this.id = id;
		this.complete = complete;
		this.form = form;
		this.applicant = applicant;
		this.language = language;
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
	 * @return the complete
	 */
	public Boolean getComplete() {
		return complete;
	}

	/**
	 * @param complete the complete to set
	 */
	public void setComplete(Boolean complete) {
		this.complete = complete;
	}

	/**
	 * @return the form
	 */
	public Form getForm() {
		return form;
	}

	/**
	 * @param form the form to set
	 */
	public void setForm(Form form) {
		this.form = form;
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
	 * @return the language
	 */
	public Language getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(Language language) {
		this.language = language;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applicant == null) ? 0 : applicant.hashCode());
		result = prime * result + ((complete == null) ? 0 : complete.hashCode());
		result = prime * result + ((form == null) ? 0 : form.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((language == null) ? 0 : language.hashCode());
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
		Submission other = (Submission) obj;
		if (applicant == null) {
			if (other.applicant != null)
				return false;
		} else if (!applicant.equals(other.applicant))
			return false;
		if (complete == null) {
			if (other.complete != null)
				return false;
		} else if (!complete.equals(other.complete))
			return false;
		if (form == null) {
			if (other.form != null)
				return false;
		} else if (!form.equals(other.form))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		return true;
	}

}
