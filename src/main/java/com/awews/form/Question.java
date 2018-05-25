package com.awews.form;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "questions")
public class Question {
	
	@Id
	private String id;
	private String questionText;
	private String pageOnForm;
	private String partOfForm;
	private String questionNumber;
	
	private QuestionType questionType;
	
	private Form form;
	
	public Question() {
		
	}

	/**
	 * @param id
	 * @param questionText
	 * @param pageOnForm
	 * @param partOfForm
	 * @param questionNumber
	 * @param questionType
	 * @param form
	 */
	public Question(String id, String questionText, String pageOnForm, String partOfForm, String questionNumber,
			QuestionType questionType, Form form) {
		super();
		this.id = id;
		this.questionText = questionText;
		this.pageOnForm = pageOnForm;
		this.partOfForm = partOfForm;
		this.questionNumber = questionNumber;
		this.questionType = questionType;
		this.form = form;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Question [id=" + id + ", questionText=" + questionText + ", pageOnForm=" + pageOnForm + ", partOfForm="
				+ partOfForm + ", questionNumber=" + questionNumber + ", questionType=" + questionType + ", form="
				+ form + "]";
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
	 * @return the pageOnForm
	 */
	public String getPageOnForm() {
		return pageOnForm;
	}

	/**
	 * @param pageOnForm the pageOnForm to set
	 */
	public void setPageOnForm(String pageOnForm) {
		this.pageOnForm = pageOnForm;
	}

	/**
	 * @return the partOfForm
	 */
	public String getPartOfForm() {
		return partOfForm;
	}

	/**
	 * @param partOfForm the partOfForm to set
	 */
	public void setPartOfForm(String partOfForm) {
		this.partOfForm = partOfForm;
	}

	/**
	 * @return the questionNumber
	 */
	public String getQuestionNumber() {
		return questionNumber;
	}

	/**
	 * @param questionNumber the questionNumber to set
	 */
	public void setQuestionNumber(String questionNumber) {
		this.questionNumber = questionNumber;
	}

	/**
	 * @return the questionType
	 */
	public QuestionType getQuestionType() {
		return questionType;
	}

	/**
	 * @param questionType the questionType to set
	 */
	public void setQuestionType(QuestionType questionType) {
		this.questionType = questionType;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((form == null) ? 0 : form.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pageOnForm == null) ? 0 : pageOnForm.hashCode());
		result = prime * result + ((partOfForm == null) ? 0 : partOfForm.hashCode());
		result = prime * result + ((questionNumber == null) ? 0 : questionNumber.hashCode());
		result = prime * result + ((questionText == null) ? 0 : questionText.hashCode());
		result = prime * result + ((questionType == null) ? 0 : questionType.hashCode());
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
		Question other = (Question) obj;
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
		if (pageOnForm == null) {
			if (other.pageOnForm != null)
				return false;
		} else if (!pageOnForm.equals(other.pageOnForm))
			return false;
		if (partOfForm == null) {
			if (other.partOfForm != null)
				return false;
		} else if (!partOfForm.equals(other.partOfForm))
			return false;
		if (questionNumber == null) {
			if (other.questionNumber != null)
				return false;
		} else if (!questionNumber.equals(other.questionNumber))
			return false;
		if (questionText == null) {
			if (other.questionText != null)
				return false;
		} else if (!questionText.equals(other.questionText))
			return false;
		if (questionType == null) {
			if (other.questionType != null)
				return false;
		} else if (!questionType.equals(other.questionType))
			return false;
		return true;
	}

}
