package com.example.learn_spring_jdbc.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.learn_spring_jdbc.DTOs.User;

@Repository
public interface JDBC_Repo {

	@Transactional
	public String saveUser(User users);
	
	@Transactional
	public List<User> getUsers();
	
    @Transactional
    public String updateUser(User user);
    
    @Transactional
    public String deleteById(int id);
    
    
    @Transactional
	public User getSingleUser(int id);
}
