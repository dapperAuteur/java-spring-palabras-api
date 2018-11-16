package com.awews.person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.GET, value="/api/ver0001/users")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@RequestMapping("/api/ver0001/users/{id}")
	public User getUserById(@PathVariable String id) {
		return userService.getUserById(id);
	}
	
	@RequestMapping("/api/ver0001/users/username/{username}")
	public User getUserByUsername(@PathVariable String username) {
		return userService.getUserByUsername(username);
	}
	
	@RequestMapping("/api/ver0001/users/email/{emailSlug}")
	public User getUserByEmailSlug(@PathVariable String emailSlug) {
		return userService.getUserByEmailSlug(emailSlug);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/api/ver0001/users")
	public User addUser(@RequestBody User user) {
		userService.addUser(user);
		return user;
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/api/ver0001/users/{id}")
	public User updateUser(@RequestBody User user, @PathVariable String id) {
		userService.updateUser(id, user);
		return user;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/api/ver0001/users/{id}")
	public void deleteUser(@PathVariable String id) {
		userService.deleteUser(id);

	}
}
