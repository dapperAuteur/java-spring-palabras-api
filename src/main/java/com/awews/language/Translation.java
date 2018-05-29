package com.awews.language;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.awews.form.Form;
import com.awews.form.Question;

@Document(collection = "translations")
public class Translation {
	
	@Id
	private String id;
	private String questionText;
	
	Form form;

	Language language;
	
	Question question;
	
	public Translation() {
		
	}

	/**
	 * @param id
	 * @param questionText
	 * @param form
	 * @param language
	 * @param question
	 */
	public Translation(String id, String questionText, Form form, Language language, Question question) {
		super();
		this.id = id;
		this.questionText = questionText;
		this.form = form;
		this.language = language;
		this.question = question;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Translation [id=" + id + ", questionText=" + questionText + ", form=" + form + ", language=" + language
				+ ", question=" + question + "]";
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
	 * @return the questionText
	 */
	public String getQuestionText() {
		return questionText;
	}

	/**
	 * @param questionText the questionText to set
	 */
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((form == null) ? 0 : form.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((question == null) ? 0 : question.hashCode());
		result = prime * result + ((questionText == null) ? 0 : questionText.hashCode());
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
		Translation other = (Translation) obj;
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
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		if (questionText == null) {
			if (other.questionText != null)
				return false;
		} else if (!questionText.equals(other.questionText))
			return false;
		return true;
	}

}
