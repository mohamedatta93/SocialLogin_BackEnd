package com.mohamedatta.examinly.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mohamedatta.examinly.model.User;
import com.mohamedatta.examinly.model.repository.UserRepository;
import com.mohamedatta.examinly.security.SecurityUser;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	  private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		return null;
	}
	

	public UserDetails loadUser(User user) {
		
		User user1 = userRepository.findByEmail(user.getEmail());
			if(user1 == null)
				userRepository.save(user);
			user = userRepository.findByEmail(user.getEmail());
			
			
	
		
		return create(user);
	}
	
	public UserDetails create(User user) {
		
		return new SecurityUser(user.getID(),user.getUserName(),user.getPassword(),user.getEmail()
				,new Date(),null);
		
	} 
}
