package com.techhub.iservice;

import java.util.List;

import com.techhub.model.User;

public interface IUserService {

	public void saveUser(User user);
	
	public List<User> showAllUsers();
	
	public void deleteUser(int id);
	
	public User editUser(int id);
	
	public User findByUsernameAndPassword(String username, String password);
}
