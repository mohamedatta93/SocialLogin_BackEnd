package com.mohamedatta.examinly.service;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import org.springframework.stereotype.Service;
@Service
public class MailVerifier {

	public boolean isValid(String email) throws AddressException {
		boolean isValid = false;
			// Create InternetAddress object and validated the supplied
			// address which is this case is an email address.
			InternetAddress internetAddress = new InternetAddress(email);
			internetAddress.validate();
			isValid = true;
		
			
		return isValid;
	}
	
}
