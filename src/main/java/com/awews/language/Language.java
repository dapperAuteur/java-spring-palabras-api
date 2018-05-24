package com.awews.language;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "languages")
public class Language {
	
	@Id
	private String id;
	private String languageName;
	
	public Language() {
		
	}

	/**
	 * @param id
	 * @param languageName
	 */
	public Language(String id, String languageName) {
		super();
		this.id = id;
		this.languageName = languageName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Language [id=" + id + ", languageName=" + languageName + "]";
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
	 * @return the languageName
	 */
	public String getLanguageName() {
		return languageName;
	}

	/**
	 * @param languageName the languageName to set
	 */
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((languageName == null) ? 0 : languageName.hashCode());
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
		Language other = (Language) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (languageName == null) {
			if (other.languageName != null)
				return false;
		} else if (!languageName.equals(other.languageName))
			return false;
		return true;
	}
	
	

}
