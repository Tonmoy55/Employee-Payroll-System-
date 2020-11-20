package com.techhub.idao;

import java.util.List;

import com.techhub.model.User;

public interface IUserdao {

	public void save(User user);
	
	public List<User> findAll();
	
	public void deleteById(int id);
	
	public User findById(int id);
	
	public User findByUsernameAndPassword(String username, String password);
}
