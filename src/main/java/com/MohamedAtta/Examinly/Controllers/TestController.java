package com.MohamedAtta.Examinly.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(path="/hello/{name}")
	public String hello(@PathVariable String name) {
		
		return "Hello " +name;
	}
	
}
