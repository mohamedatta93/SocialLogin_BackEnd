/**
 * 
 */
package com.mohamedatta.examinly.service;


import com.mohamedatta.examinly.model.Token;
import com.mohamedatta.examinly.model.User;

/**
 * @author Mohamed Atta
 *
 *this class authenticate the user to perform request or not
 */

public interface AuthenticationService {

/**
 * this method takes email and password and generate token if the username and pass
 * word are valid
 * @param Email
 * @param Password
 * @return token String
 */
	String IsAuthorized(String Email,String Password);
/**
 * this method if the token valid or not 
 * @param Token
 * @return true or false
 */
	Boolean IsAuthorized(String Token);
	Token generateToken(User user);
	
	
	
}
