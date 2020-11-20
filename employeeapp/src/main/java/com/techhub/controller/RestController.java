package com.techhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techhub.model.User;
import com.techhub.service.UserService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String Hello() {
		return "This is home page";
	}
	
	@GetMapping("/save-user")
	public String SaveUser(@RequestParam String userName,@RequestParam String firstName,@RequestParam String lastName,@RequestParam String password,@RequestParam int age) {
		
		User user = new User(age,userName,firstName,lastName,password);
		userService.saveUser(user);
		
		return "Data Saved";
	}
}
