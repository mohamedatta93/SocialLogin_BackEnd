/**
 * 
 */
package com.mohamedatta.examinly.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

/**
 * @author Mohamed Atta
 *
 */
@Entity
public class User {
    @Id
    @GeneratedValue
   	private Long ID;
	private String name;
	private String userName;
	private String email;
	private Date birthDate;
	private String Password;
	private String provider;

	//@OneToOne(mappedBy="user",cascade = CascadeType.ALL)
	@Transient
	private Token currentToken;
	private String profileImgPath;
	/**
	 * @return the iD
	 */
	public Long getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(Long iD) {
		ID = iD;
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
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
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
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}
	/**
	 * @return the provider
	 */
	public String getProvider() {
		return provider;
	}
	/**
	 * @param provider the provider to set
	 */
	public void setProvider(String provider) {
		this.provider = provider;
	}
	/**
	 * @return the currentToken
	 */
	public Token getCurrentToken() {
		return currentToken;
	}
	/**
	 * @param currentToken the currentToken to set
	 */
	public void setCurrentToken(Token currentToken) {
		this.currentToken = currentToken;
	}
	/**
	 * @return the profileImgPath
	 */
	public String getProfileImgPath() {
		return profileImgPath;
	}
	/**
	 * @param profileImgPath the profileImgPath to set
	 */
	public void setProfileImgPath(String profileImgPath) {
		this.profileImgPath = profileImgPath;
	}
	}
