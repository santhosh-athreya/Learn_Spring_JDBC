package com.example.learn_spring_jdbc.DTOs;

public class User {

	
	private int user_id;
	
    private String username;

    private String password;

    private String email;

    private long mobileno;

    public User()
    {

    }

    public User(int user_id,String username, String password, String email, long mobileno) {
       
    	this.user_id = user_id;
    	this.username = username;
        this.password = password;
        this.email = email;
        this.mobileno = mobileno;
    }

    
    
    public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobileno() {
        return mobileno;
    }

    public void setMobileno(long mobileno) {
        this.mobileno = mobileno;
    }
}
