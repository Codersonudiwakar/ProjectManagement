package com.ManagePro.app.Service;

import java.util.List;

import com.ManagePro.app.entities.User;

public interface UserService {
	
	public User addUser(User user);

	public User getUserById(long id);

	public List<User> getAllUsersByUsername(String Username);



}
