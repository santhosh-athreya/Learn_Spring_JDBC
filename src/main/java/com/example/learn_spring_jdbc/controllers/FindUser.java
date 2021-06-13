package com.example.learn_spring_jdbc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.learn_spring_jdbc.DAO.JDBC_Repo;
import com.example.learn_spring_jdbc.DTOs.User;

@RestController
public class FindUser {

	 @Autowired
	 private JDBC_Repo jdbc;

	
	@GetMapping("/User")
	public User getUserById(@RequestParam(name="id") int id)
	{
		return jdbc.getSingleUser(id);
		
	}

}
