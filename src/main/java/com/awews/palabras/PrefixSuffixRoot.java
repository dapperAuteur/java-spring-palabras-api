package com.awews.palabras;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "prefixsuffixroots")
public class PrefixSuffixRoot {
	
	@Id
	private String id;
//	@Indexed(direction = IndexDirection.ASCENDING)
	private String word;
	private String wordSlug;
	private String meaning;
	private String examples;
	private String type;
	private String tongue;
	
	
//	EMPTY CONSTRUCTOR
	/**
	 * @param id
	 * @param word
	 * @param wordSlug
	 * @param meaning
	 * @param examples
	 * @param type
	 * @param tongue
	 */
	public PrefixSuffixRoot() {
		
	}
	
//	CONSTRUCTORS
	/**
	 * @param id
	 * @param word
	 * @param wordSlug
	 * @param meaning
	 * @param examples
	 * @param type
	 * @param tongue
	 */
	public PrefixSuffixRoot(String id, String word, String wordSlug, String meaning, String examples, String type,
			String tongue) {
		super();
		this.id = id;
		this.word = word;
		this.wordSlug = wordSlug;
		this.meaning = meaning;
		this.examples = examples;
		this.type = type;
		this.tongue = tongue;
	}

	
//	TO STRING
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PrefixSuffixRoot [id=" + id + ", word=" + word + ", wordSlug=" + wordSlug + ", meaning=" + meaning
				+ ", examples=" + examples + ", type=" + type + ", tongue=" + tongue + "]";
	}
	
//	GETTERS/SETTERS
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
	 * @return the word
	 */
	public String getWord() {
		return word;
	}

	/**
	 * @param word the word to set
	 */
	public void setWord(String word) {
		this.word = word;
	}

	/**
	 * @return the wordSlug
	 */
	public String getWordSlug() {
		return wordSlug;
	}

	/**
	 * @param wordSlug the wordSlug to set
	 */
	public void setWordSlug(String wordSlug) {
		this.wordSlug = wordSlug;
	}

	/**
	 * @return the meaning
	 */
	public String getMeaning() {
		return meaning;
	}

	/**
	 * @param meaning the meaning to set
	 */
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	/**
	 * @return the examples
	 */
	public String getExamples() {
		return examples;
	}

	/**
	 * @param examples the examples to set
	 */
	public void setExamples(String examples) {
		this.examples = examples;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the tongue
	 */
	public String getTongue() {
		return tongue;
	}

	/**
	 * @param tongue the tongue to set
	 */
	public void setTongue(String tongue) {
		this.tongue = tongue;
	}
//	HASHCODE/EQUALS

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((examples == null) ? 0 : examples.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((meaning == null) ? 0 : meaning.hashCode());
		result = prime * result + ((tongue == null) ? 0 : tongue.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		result = prime * result + ((wordSlug == null) ? 0 : wordSlug.hashCode());
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
		PrefixSuffixRoot other = (PrefixSuffixRoot) obj;
		if (examples == null) {
			if (other.examples != null)
				return false;
		} else if (!examples.equals(other.examples))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (meaning == null) {
			if (other.meaning != null)
				return false;
		} else if (!meaning.equals(other.meaning))
			return false;
		if (tongue == null) {
			if (other.tongue != null)
				return false;
		} else if (!tongue.equals(other.tongue))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		if (wordSlug == null) {
			if (other.wordSlug != null)
				return false;
		} else if (!wordSlug.equals(other.wordSlug))
			return false;
		return true;
	}

	
}
