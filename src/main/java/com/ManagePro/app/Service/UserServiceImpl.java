package com.ManagePro.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ManagePro.app.Repository.TaskRepository;
import com.ManagePro.app.Repository.UserRepository;
import com.ManagePro.app.entities.User;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepo;

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public User getUserById(long id) {
		// TODO Auto-generated method stub
		return userRepo.getById(id);
	}

	@Override
	public List<User> getAllUsersByUsername(String Username) {
		// TODO Auto-generated method stub
		List<User> userList=userRepo.getUserByUserName(Username);
		return userList;
	}




}
