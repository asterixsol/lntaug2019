package com.lnt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lnt.domain.Employee;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello()
	{
		return "Hey there !!";
	}
	
	@PostMapping("/nameage")
	public String calculateNameAge(@RequestParam String name,@RequestParam String age)
	{
		return "Hello "+name+" you are "+age+" years old, next year you will be "+(age+1)+" years old";
	}
	
	
	@PostMapping("/employee")
	public String getEmployeeDetails(@RequestBody Employee e)
	{
		System.out.println(e.toString());
		return e.toString();
	}
	
	@PostMapping("/employeeTest")
	public @ResponseBody Employee getEmployeeDetails1(@RequestBody Employee e)
	{
		System.out.println(e.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return e;
	}


}
