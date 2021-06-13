package com.example.learn_spring_jdbc.DAO;

import com.example.learn_spring_jdbc.DTOs.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class JDBC_Repo {

    
    @Autowired
    private JdbcTemplate jdbc;

    
    @Transactional
    public String saveUser(User users)
    {
          //using JDBCTemplate
       int result = jdbc.update("insert into user(username,password,email,mobileno)values(?,?,?,?)", new Object[] {
        	         users.getUsername(),users.getPassword(),users.getEmail(),users.getMobileno()	
        });

       if(result!=0) {
    	   
          return "User by name: "+ users.getUsername() + " Successfully Saved!";
       }
       else {
    	   
    	   return "Insert API Failed";
      }
    }    

    @Transactional
    public List<User> getUsers()
    {
        return jdbc.query("SELECT * FROM explore.user",
        		                new BeanPropertyRowMapper<>(User.class));
    }
    
    @SuppressWarnings("deprecation")
    @Transactional
	public User getSingleUser(int id)
    {
      return jdbc.queryForObject("SELECT * FROM explore.user WHERE user_id = ?", new Object[]{id}, 
    		                        new BeanPropertyRowMapper<>(User.class));
    }
    
    @Transactional
    public String updateUser(User user) {
    	
    	int result = jdbc.update("update explore.user set user.password = ?,user.mobileno = ? where user.user_id = ?;"
    			, new Object[] {
    					user.getPassword(),user.getMobileno(),user.getUser_id()
    					});
    	
    	if(result!=0)
    	{
    		return "User With Id: "+ user.getUser_id() +" Updated Successfully";
    	}
    	else {
    	return "User with Id: "+ user.getUser_id() + " Doesnt Exists!";
    }
   }
    
    @Transactional
    public String deleteById(int id)
    {
    	int result = jdbc.update("DELETE FROM explore.user WHERE user_id = ?",new Object[]{id});
    	
    	if(result!=0)
    	{
    		return "Data Successfully Deleted! user Id: "+ id; 
    	}
    	else
    	{
    		return "Delete api Failed!";
    	}
    }
}
