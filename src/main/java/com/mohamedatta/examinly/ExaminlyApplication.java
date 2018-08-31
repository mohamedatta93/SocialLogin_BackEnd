package com.mohamedatta.examinly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
//@ComponentScan(basePackages= {"com.mohamedatta.examinly","com.mohamedatta.examinly.model","com.mohamedatta.examinly.controllers"})
public class ExaminlyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExaminlyApplication.class, args);
	}
	
}
