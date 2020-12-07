package com.demo.dbandjpa.service;

import java.util.List;

import com.demo.dbandjpa.model.User;

public interface UserService {
	
	public User createUser(User user);
	
	public User updateUser(User user);
	
	public List<User> getAllUser();	
	
	public User getUserById(int userId);
	
	public void deleteUser(int userId);
}
