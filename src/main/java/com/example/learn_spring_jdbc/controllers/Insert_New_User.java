package com.example.learn_spring_jdbc.controllers;

import com.example.learn_spring_jdbc.DAO.JDBC_Repo;
import com.example.learn_spring_jdbc.DTOs.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Insert_New_User {


    @Autowired
    private JDBC_Repo jdbc;

    @PostMapping("/save")
    public String insert(@RequestBody User user)
    {
        return jdbc.saveUser(user);
    }

}
