package com.awews.person;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.ToString;

@Document(collection = "users")
@ToString(exclude = "password")
public class User {
	
	public static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();
	
	@Id
	private String id;
	private String email;
	private String username;
	private Integer role;
	private @JsonIgnore String password;
	private String profileImageUrl;
	
	public User() {
		
	}

	/**
	 * @param id
	 * @param email
	 * @param username
	 * @param role
	 * @param password
	 * @param profileImageUrl
	 */
	public User(String id, String email, String username, Integer role, String password, String profileImageUrl) {
		super();
		this.id = id;
		this.email = email;
		this.username = username;
		this.role = role;
		this.password = password;
		this.profileImageUrl = profileImageUrl;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", username=" + username + ", role=" + role + ", password="
				+ password + ", profileImageUrl=" + profileImageUrl + "]";
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the username
	 */
	public String getUserName() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUserName(String username) {
		this.username = username;
	}

	/**
	 * @return the role
	 */
	public Integer getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(Integer role) {
		this.role = role;
	}

	/**
	 * @return the password
	 */
	public String getPasswordHash() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPasswordHash(String password) {
		this.password = password;
	}

	/**
	 * @return the profileImageUrl
	 */
	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	/**
	 * @param profileImageUrl the profileImageUrl to set
	 */
	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((profileImageUrl == null) ? 0 : profileImageUrl.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (profileImageUrl == null) {
			if (other.profileImageUrl != null)
				return false;
		} else if (!profileImageUrl.equals(other.profileImageUrl))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

}
