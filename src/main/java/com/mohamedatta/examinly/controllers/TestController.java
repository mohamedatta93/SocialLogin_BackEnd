package com.mohamedatta.examinly.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="")
public class TestController {

	@GetMapping(path="/hello")
	public String hello() {
		
		return "Hello ";
	}
	
}
