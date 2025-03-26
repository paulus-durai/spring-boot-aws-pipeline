package com.aws.example.spring_boot_cicd.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AWSDemo {
	
	@GetMapping
	public String awsDemoPinpeline()
	{
		return "<h2> welcome to AWS </h2>";
	}
	
	

}
