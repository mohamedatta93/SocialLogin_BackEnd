package com.mohamedatta.examinly.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Token {
//	@Id
//	@GeneratedValue
//	Long ID;
//	@OneToOne
//	@JoinColumn(name = "user_id", nullable = false)
//	private User user;
	String token;


	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

}
