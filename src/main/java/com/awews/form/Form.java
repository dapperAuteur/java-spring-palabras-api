package com.awews.form;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "forms")
public class Form {
	
	@Id
	private String id;
	private String name;
	private String formNumber;
	private String formLocation;
	
	public Form() {
		
	}

	/**
	 * @param id
	 * @param name
	 * @param formNumber
	 * @param formLocation
	 */
	public Form(String id, String name, String formNumber, String formLocation) {
		super();
		this.id = id;
		this.name = name;
		this.formNumber = formNumber;
		this.formLocation = formLocation;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Form [id=" + id + ", name=" + name + ", formNumber=" + formNumber + ", formLocation=" + formLocation
				+ "]";
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the formNumber
	 */
	public String getFormNumber() {
		return formNumber;
	}

	/**
	 * @param formNumber the formNumber to set
	 */
	public void setFormNumber(String formNumber) {
		this.formNumber = formNumber;
	}

	/**
	 * @return the formLocation
	 */
	public String getFormLocation() {
		return formLocation;
	}

	/**
	 * @param formLocation the formLocation to set
	 */
	public void setFormLocation(String formLocation) {
		this.formLocation = formLocation;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((formLocation == null) ? 0 : formLocation.hashCode());
		result = prime * result + ((formNumber == null) ? 0 : formNumber.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Form other = (Form) obj;
		if (formLocation == null) {
			if (other.formLocation != null)
				return false;
		} else if (!formLocation.equals(other.formLocation))
			return false;
		if (formNumber == null) {
			if (other.formNumber != null)
				return false;
		} else if (!formNumber.equals(other.formNumber))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
