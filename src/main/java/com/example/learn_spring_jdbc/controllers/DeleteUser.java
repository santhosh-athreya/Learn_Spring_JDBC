package com.example.learn_spring_jdbc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.learn_spring_jdbc.DAO.JDBC_Repo;

@RestController
public class DeleteUser {

	
	@Autowired
	private JDBC_Repo jdbc; 
	
	@DeleteMapping("/removeUser")
	public String deleteUserById(@RequestParam(name="id") int id)
	{
	    return jdbc.deleteById(id);	
	}
}
