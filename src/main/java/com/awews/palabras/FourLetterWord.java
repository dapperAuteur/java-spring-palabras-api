package com.awews.palabras;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fourletterwords")
public class FourLetterWord {
		
	@Id
	private String id;
//		@Indexed(direction = IndexDirection.ASCENDING)
	private String word;
	private String wordSlug;
	private String definition;
	private Integer s_points;
	private Integer f_points;
	private Integer tier;
	private Boolean in_game;
	private String tongue;
	
	
//		EMPTY CONSTRUCTOR
	/**
	 *
	 */
	public FourLetterWord() {
		
	}
	
//		CONSTRUCTORS
	/**
	 * @param id
	 * @param word
	 * @param wordSlug
	 * @param definition
	 * @param s_points
	 * @param f_points
	 * @param tier
	 * @param in_game
	 * @param tongue
	 */
	public FourLetterWord(String id, String word, String wordSlug, String definition, Integer s_points, Integer f_points,
			Integer tier, Boolean in_game, String tongue) {
		super();
		this.id = id;
		this.word = word;
		this.wordSlug = wordSlug;
		this.definition = definition;
		this.s_points = s_points;
		this.f_points = f_points;
		this.tier = tier;
		this.in_game = in_game;
		this.tongue = tongue;
	}
//		TO STRING

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Verbo [id=" + id + ", word=" + word + ", wordSlug=" + wordSlug + ", definition=" + definition
				+ ", s_points=" + s_points + ", f_points=" + f_points + ", tier=" + tier + ", in_game=" + in_game
				+ ", tongue=" + tongue + "]";
	}
	
	
//		GETTERS/SETTERS
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
	 * @return the definition
	 */
	public String getDefinition() {
		return definition;
	}

	/**
	 * @param definition the definition to set
	 */
	public void setDefinition(String definition) {
		this.definition = definition;
	}

	/**
	 * @return the s_points
	 */
	public Integer getS_points() {
		return s_points;
	}

	/**
	 * @param s_points the s_points to set
	 */
	public void setS_points(Integer s_points) {
		this.s_points = s_points;
	}

	/**
	 * @return the f_points
	 */
	public Integer getF_points() {
		return f_points;
	}

	/**
	 * @param f_points the f_points to set
	 */
	public void setF_points(Integer f_points) {
		this.f_points = f_points;
	}

	/**
	 * @return the tier
	 */
	public Integer getTier() {
		return tier;
	}

	/**
	 * @param tier the tier to set
	 */
	public void setTier(Integer tier) {
		this.tier = tier;
	}

	/**
	 * @return the in_game
	 */
	public Boolean getIn_game() {
		return in_game;
	}

	/**
	 * @param in_game the in_game to set
	 */
	public void setIn_game(Boolean in_game) {
		this.in_game = in_game;
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
	
//		HASHCODE/EQUALS
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((definition == null) ? 0 : definition.hashCode());
		result = prime * result + ((f_points == null) ? 0 : f_points.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((in_game == null) ? 0 : in_game.hashCode());
		result = prime * result + ((s_points == null) ? 0 : s_points.hashCode());
		result = prime * result + ((tier == null) ? 0 : tier.hashCode());
		result = prime * result + ((tongue == null) ? 0 : tongue.hashCode());
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
		FourLetterWord other = (FourLetterWord) obj;
		if (definition == null) {
			if (other.definition != null)
				return false;
		} else if (!definition.equals(other.definition))
			return false;
		if (f_points == null) {
			if (other.f_points != null)
				return false;
		} else if (!f_points.equals(other.f_points))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (in_game == null) {
			if (other.in_game != null)
				return false;
		} else if (!in_game.equals(other.in_game))
			return false;
		if (s_points == null) {
			if (other.s_points != null)
				return false;
		} else if (!s_points.equals(other.s_points))
			return false;
		if (tier == null) {
			if (other.tier != null)
				return false;
		} else if (!tier.equals(other.tier))
			return false;
		if (tongue == null) {
			if (other.tongue != null)
				return false;
		} else if (!tongue.equals(other.tongue))
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
