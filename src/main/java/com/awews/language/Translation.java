package com.awews.language;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "translations")
public class Translation {
	
	@Id
	private String id;
	private String translationName;
	
	public Translation() {
		
	}

	/**
	 * @param id
	 * @param translationName
	 */
	public Translation(String id, String translationName) {
		super();
		this.id = id;
		this.translationName = translationName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Translation [id=" + id + ", translationName=" + translationName + "]";
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
	 * @return the translationName
	 */
	public String getTranslationName() {
		return translationName;
	}

	/**
	 * @param translationName the translationName to set
	 */
	public void setTranslationName(String translationName) {
		this.translationName = translationName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((translationName == null) ? 0 : translationName.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (translationName == null) {
			if (other.translationName != null)
				return false;
		} else if (!translationName.equals(other.translationName))
			return false;
		return true;
	}
	
	

}
