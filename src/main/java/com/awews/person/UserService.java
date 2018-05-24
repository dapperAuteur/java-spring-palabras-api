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
	
	public User getUserById(String id) {
//		return users.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return userRepository.findOne(id);
	}
	
//	doesn't work
	public User getUserBySpanishSlug(String spanishSlug) {
//		return users.stream().filter(n -> n.getSpanishSlug().equals(spanishSlug)).findFirst().get();
		return userRepository.findOne(spanishSlug);
		
	}

	public User addUser(User user) {
		// TODO Auto-generated method stub
//		users.add(user);
//		return user;
		userRepository.save(user);
		return user;
		
	}

	public User updateUser(String id, User user) {
		// TODO Auto-generated method stub
//		for(int i = 0; i < users.size(); i++) {
//			Course t = users.get(i);
//			if (t.getId().equals(id)) {
//				users.set(i, user);
//				return user;
//			}
//		}
//		return user;
		return userRepository.save(user);
	}

//	public Course deleteUser(String id) {
//		Course user = null;
//		// TODO Auto-generated method stub
//		users.removeIf(t -> t.getId().equals(id));
//		
//		return user;
//	}
	
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
//		users.removeIf(t -> t.getId().equals(id));
		userRepository.delete(id);
		
	}

}
