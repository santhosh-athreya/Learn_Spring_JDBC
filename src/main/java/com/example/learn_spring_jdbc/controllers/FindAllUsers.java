package com.example.learn_spring_jdbc.controllers;

import com.example.learn_spring_jdbc.DAO.JDBC_Repo;
import com.example.learn_spring_jdbc.DTOs.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FindAllUsers {


    private JDBC_Repo jdbcRepo;


    public  FindAllUsers(JDBC_Repo jdbcRepo)
    {
        this.jdbcRepo = jdbcRepo;
    }

    @GetMapping("/Users")
    public List<User> findUsers()
    {
       return jdbcRepo.getUsers();

    }
}
