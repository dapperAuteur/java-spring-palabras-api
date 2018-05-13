package com.awews.palabras;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "verbos")
public class Verbo {
	
	@Id
	private String id;
//	@Indexed(direction = IndexDirection.ASCENDING)
	private String spanish;
	private String spanishSlug;
	private String english;
	private String englishSlug;
	private Boolean reflexive;
	private Boolean irregular;
	private String categoría_de_irregular;
	private String cambiar_de_irregular;
	private String terminación;
	private Integer grupo;
	
//	EMPTY CONSTRUCTOR
	public Verbo() {
		
	}
	/**
	 * CONSTRUCTORS
	 * @param id
	 * @param spanish
	 * @param spanishSlug
	 * @param english
	 * @param englishSlug
	 * @param reflexive
	 * @param irregular
	 * @param categoría_de_irregular
	 * @param cambiar_de_irregular
	 * @param terminación
	 * @param grupo
	 */
	public Verbo(String id, String spanish, String spanishSlug, String english, String englishSlug, Boolean reflexive,
			Boolean irregular, String categoría_de_irregular, String cambiar_de_irregular, String terminación,
			Integer grupo) {
		super();
		this.id = id;
		this.spanish = spanish;
		this.spanishSlug = spanishSlug;
		this.english = english;
		this.englishSlug = englishSlug;
		this.reflexive = reflexive;
		this.irregular = irregular;
		this.categoría_de_irregular = categoría_de_irregular;
		this.cambiar_de_irregular = cambiar_de_irregular;
		this.terminación = terminación;
		this.grupo = grupo;
	}
	
	
	/* (non-Javadoc)
	 * TO STRING
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Verbo [id=" + id + ", spanish=" + spanish + ", spanishSlug=" + spanishSlug + ", english=" + english
				+ ", englishSlug=" + englishSlug + ", reflexive=" + reflexive + ", irregular=" + irregular
				+ ", categoría_de_irregular=" + categoría_de_irregular + ", cambiar_de_irregular="
				+ cambiar_de_irregular + ", terminación=" + terminación + ", grupo=" + grupo + "]";
	}
	/**
	 * GETTERS/SETTERS
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
	 * @return the spanish
	 */
	public String getSpanish() {
		return spanish;
	}
	/**
	 * @param spanish the spanish to set
	 */
	public void setSpanish(String spanish) {
		this.spanish = spanish;
	}
	/**
	 * @return the spanishSlug
	 */
	public String getSpanishSlug() {
		return spanishSlug;
	}
	/**
	 * @param spanishSlug the spanishSlug to set
	 */
	public void setSpanishSlug(String spanishSlug) {
		this.spanishSlug = spanishSlug;
	}
	/**
	 * @return the english
	 */
	public String getEnglish() {
		return english;
	}
	/**
	 * @param english the english to set
	 */
	public void setEnglish(String english) {
		this.english = english;
	}
	/**
	 * @return the englishSlug
	 */
	public String getEnglishSlug() {
		return englishSlug;
	}
	/**
	 * @param englishSlug the englishSlug to set
	 */
	public void setEnglishSlug(String englishSlug) {
		this.englishSlug = englishSlug;
	}
	/**
	 * @return the reflexive
	 */
	public Boolean getReflexive() {
		return reflexive;
	}
	/**
	 * @param reflexive the reflexive to set
	 */
	public void setReflexive(Boolean reflexive) {
		this.reflexive = reflexive;
	}
	/**
	 * @return the irregular
	 */
	public Boolean getIrregular() {
		return irregular;
	}
	/**
	 * @param irregular the irregular to set
	 */
	public void setIrregular(Boolean irregular) {
		this.irregular = irregular;
	}
	/**
	 * @return the categoría_de_irregular
	 */
	public String getCategoría_de_irregular() {
		return categoría_de_irregular;
	}
	/**
	 * @param categoría_de_irregular the categoría_de_irregular to set
	 */
	public void setCategoría_de_irregular(String categoría_de_irregular) {
		this.categoría_de_irregular = categoría_de_irregular;
	}
	/**
	 * @return the cambiar_de_irregular
	 */
	public String getCambiar_de_irregular() {
		return cambiar_de_irregular;
	}
	/**
	 * @param cambiar_de_irregular the cambiar_de_irregular to set
	 */
	public void setCambiar_de_irregular(String cambiar_de_irregular) {
		this.cambiar_de_irregular = cambiar_de_irregular;
	}
	/**
	 * @return the terminación
	 */
	public String getTerminación() {
		return terminación;
	}
	/**
	 * @param terminación the terminación to set
	 */
	public void setTerminación(String terminación) {
		this.terminación = terminación;
	}
	/**
	 * @return the grupo
	 */
	public Integer getGrupo() {
		return grupo;
	}
	/**
	 * @param grupo the grupo to set
	 */
	public void setGrupo(Integer grupo) {
		this.grupo = grupo;
	}
	/* (non-Javadoc)
	 * HASHCODE/EQUALS
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cambiar_de_irregular == null) ? 0 : cambiar_de_irregular.hashCode());
		result = prime * result + ((categoría_de_irregular == null) ? 0 : categoría_de_irregular.hashCode());
		result = prime * result + ((english == null) ? 0 : english.hashCode());
		result = prime * result + ((englishSlug == null) ? 0 : englishSlug.hashCode());
		result = prime * result + ((grupo == null) ? 0 : grupo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((irregular == null) ? 0 : irregular.hashCode());
		result = prime * result + ((reflexive == null) ? 0 : reflexive.hashCode());
		result = prime * result + ((spanish == null) ? 0 : spanish.hashCode());
		result = prime * result + ((spanishSlug == null) ? 0 : spanishSlug.hashCode());
		result = prime * result + ((terminación == null) ? 0 : terminación.hashCode());
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
		Verbo other = (Verbo) obj;
		if (cambiar_de_irregular == null) {
			if (other.cambiar_de_irregular != null)
				return false;
		} else if (!cambiar_de_irregular.equals(other.cambiar_de_irregular))
			return false;
		if (categoría_de_irregular == null) {
			if (other.categoría_de_irregular != null)
				return false;
		} else if (!categoría_de_irregular.equals(other.categoría_de_irregular))
			return false;
		if (english == null) {
			if (other.english != null)
				return false;
		} else if (!english.equals(other.english))
			return false;
		if (englishSlug == null) {
			if (other.englishSlug != null)
				return false;
		} else if (!englishSlug.equals(other.englishSlug))
			return false;
		if (grupo == null) {
			if (other.grupo != null)
				return false;
		} else if (!grupo.equals(other.grupo))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (irregular == null) {
			if (other.irregular != null)
				return false;
		} else if (!irregular.equals(other.irregular))
			return false;
		if (reflexive == null) {
			if (other.reflexive != null)
				return false;
		} else if (!reflexive.equals(other.reflexive))
			return false;
		if (spanish == null) {
			if (other.spanish != null)
				return false;
		} else if (!spanish.equals(other.spanish))
			return false;
		if (spanishSlug == null) {
			if (other.spanishSlug != null)
				return false;
		} else if (!spanishSlug.equals(other.spanishSlug))
			return false;
		if (terminación == null) {
			if (other.terminación != null)
				return false;
		} else if (!terminación.equals(other.terminación))
			return false;
		return true;
	}
	
	
	
	

}
