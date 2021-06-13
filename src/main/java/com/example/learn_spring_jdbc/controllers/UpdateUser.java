package com.example.learn_spring_jdbc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.learn_spring_jdbc.DAO.JDBC_Repo;
import com.example.learn_spring_jdbc.DTOs.User;

@RestController
public class UpdateUser {

	 @Autowired
	 private JDBC_Repo jdbc;
	
	@PostMapping("/EditUser")
	public String updateUser(@RequestBody User user) {
		
		
		return jdbc.updateUser(user);
		
		
	}

}
