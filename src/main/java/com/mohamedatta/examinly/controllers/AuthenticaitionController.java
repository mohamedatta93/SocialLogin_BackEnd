package com.mohamedatta.examinly.controllers;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Map;

import javax.xml.bind.DatatypeConverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mohamedatta.examinly.model.ResponseError;
import com.mohamedatta.examinly.model.User;
import com.mohamedatta.examinly.service.AuthenticationService;

@RestController
@RequestMapping(path="/auth")
public class AuthenticaitionController {

	@Autowired
	private AuthenticationService authService;
	@Autowired
	ResponseError responseError;
	@PostMapping(path="/login_in")
	@ResponseBody
	public Object signIn(@RequestBody User user) {
				
	return responseError;	
	}
	
	@GetMapping(path="/hello")
	public String hello()
	{
		return "Hello";
	}
	
}
