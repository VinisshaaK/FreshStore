package com.example.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Users;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping
	public String getUser()
	{
		return "get user was called";
				
	}
	@PostMapping
	public void createUser(@Validated @RequestBody Users  user)
	{
		
		userService.createUser(user);
		
		
	}
	
	@PutMapping
	public String updateUser()
	{
		return "update user was called";
		
	}
	
	@DeleteMapping
	public String deleteUser() 
	{
		return "delete User was called";
	}
}

