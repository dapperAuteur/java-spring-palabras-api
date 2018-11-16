package com.awews.person;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<>();
		userRepository.findAll()
			.forEach(users::add);
		return users;
	}
	
	public User getUserByUsername(String username) {
		return userRepository.findByUsername(username);
	}
	
	public User getUserById(String id) {
		return userRepository.findOne(id);
	}
	
//	doesn't work
	public User getUserByEmailSlug(String emailSlug) {
		return userRepository.findOne(emailSlug);
		
	}

	public User addUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
		return user;
		
	}

	public User updateUser(String id, User user) {	
		return userRepository.save(user);
	}
	
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		userRepository.delete(id);
		
	}

}
