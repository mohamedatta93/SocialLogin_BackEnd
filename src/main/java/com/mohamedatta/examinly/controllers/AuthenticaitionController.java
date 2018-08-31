package com.mohamedatta.examinly.controllers;

import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mohamedatta.examinly.model.ResponseError;
import com.mohamedatta.examinly.model.User;
import com.mohamedatta.examinly.model.repository.UserRepository;
import com.mohamedatta.examinly.service.AuthenticationService;
import com.mohamedatta.examinly.service.MailVerifier;

@RestController
@RequestMapping(path="/auth")
@CrossOrigin
public class AuthenticaitionController {

	@Autowired
	private AuthenticationService authService;
	@Autowired
	private UserRepository userRepository;
	ResponseError responseError  = new ResponseError();
	@Autowired
	MailVerifier mailVerifier;


	@Autowired
	UserRepository userRepo;
	@PostMapping(path="/login_in")
	@ResponseBody
	public Object signIn(@RequestBody User user) {
		User user1 = null;
		if(user.getEmail()!= null)
 			user1 = userRepo.findByEmail(user.getEmail());
		if( user1 == null) //sign up
		{
			try {
				if(mailVerifier.isValid(user.getEmail()))
				{
					userRepo.save(user);
					user = userRepo.findByEmail(user.getEmail());

				}

			} catch (AddressException e) {
				// TODO Auto-generated catch block
				return responseError;
			}
		}
		return authService.generateToken(user);
	}

	@GetMapping(path="/hello")
	public String hello()
	{
		return "Hello";
	}

}