/**
 * 
 */
package com.mohamedatta.examinly.service.user;
import java.util.List;

import com.mohamedatta.examinly.model.User;
/**
 * @author Mohamed Atta
 *
 */
public interface UserService {
	 List<User> getAllUsers();
	    User getUserByUsername(String username);
}
