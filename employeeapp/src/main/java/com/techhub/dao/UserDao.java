package com.techhub.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.techhub.idao.IUserdao;
import com.techhub.model.User;
import com.techhub.repository.UserRepository;

@Component
@Transactional
public class UserDao implements IUserdao {

	private final UserRepository userRepository;

	public UserDao(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void save(User user) {
		userRepository.save(user);

	}

	@Override
	public List<User> findAll() {
		List<User> users = new ArrayList<User>();

		for (User user : userRepository.findAll()) {
			users.add(user);
		}
		return users;

	}

	@Override
	public void deleteById(int id) {
		
		userRepository.deleteById(id);

	}

	@Override
	public User findById(int id) {
		
		return  userRepository.findById(id).orElse(null);
	}

	@Override
	public User findByUsernameAndPassword(String username, String password) {
		
		User user  = userRepository.findByUsernameAndPassword(username, password);
		
		return user;
	}

}
