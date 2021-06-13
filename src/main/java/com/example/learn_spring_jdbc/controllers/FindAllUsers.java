package com.example.learn_spring_jdbc.controllers;

import com.example.learn_spring_jdbc.DAO.JDBC_Repo;
import com.example.learn_spring_jdbc.DTOs.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FindAllUsers {


	 @Autowired
	 private JDBC_Repo jdbc;

    @GetMapping("/Users")
    public List<User> findUsers()
    {
       return jdbc.getUsers();

    }
}
