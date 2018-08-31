package com.mohamedatta.examinly.model;

import org.springframework.stereotype.Component;

public class ResponseError {

	Integer code;
	String message;
	Object description;
	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(Integer code) {
		this.code = code;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the description
	 */
	public Object getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(Object description) {
		this.description = description;
	}
	
}
