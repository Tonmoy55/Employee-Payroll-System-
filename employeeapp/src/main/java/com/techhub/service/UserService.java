package com.techhub.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.techhub.idao.IUserdao;
import com.techhub.iservice.IUserService;
import com.techhub.model.User;

@Service
public class UserService implements IUserService{
	
	@Autowired
	private IUserdao iUserdao;

	@Override
	public void saveUser(User user) {
		iUserdao.save(user);
		
	}

	@Override
	public List<User> showAllUsers() {
		List<User> user = iUserdao.findAll();
		return user;
	}

	@Override
	public void deleteUser(int id) {
		
		iUserdao.deleteById(id);
		
	}

	@Override
	public User editUser(int id) {
		
		User user = iUserdao.findById(id);
		return user;
	}

	@Override
	public User findByUsernameAndPassword(String username, String password) {
		User user  = iUserdao.findByUsernameAndPassword(username, password);
		return user;
	}

    
}
