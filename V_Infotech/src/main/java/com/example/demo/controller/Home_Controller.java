package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Infotech;
import com.example.demo.serviceimpl.Serviceimpl;

@RestController
public class Home_Controller {

	@Autowired
	private Serviceimpl serviceimpl;
	
	@PostMapping("/save/detail")
	public ResponseEntity<?> Login(@RequestBody Infotech infotech)
	{
		return serviceimpl.loginapi(infotech);
		
	}
	
	@PostMapping("/login/detail")
	public ResponseEntity<?> Logindetails(@RequestBody Infotech infotech)
	{
		return serviceimpl.Logindetails(infotech); 
	}
	
	
	
}
