package com.ManagePro.app.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ManagePro.app.Dto.TaskMapper;
import com.ManagePro.app.Dto.UserDto;
import com.ManagePro.app.Repository.TaskRepository;
import com.ManagePro.app.Repository.UserRepository;
import com.ManagePro.app.entities.User;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	private TaskMapper maper;

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public UserDto getUserById(long id) {
		// TODO Auto-generated method stub
		User user=userRepo.getById(id);
		return maper.entityToDtoUser(user);
	}

	@Override
	public List<UserDto> getAllUsersByUsername(String Username) {
		// TODO Auto-generated method stub
		List<User> userList=userRepo.getUserByUserName(Username);
		List<UserDto> dtoUser=new ArrayList<UserDto>();
		for (User user : userList) {
		   UserDto dto=maper.entityToDtoUser(user);
		   dtoUser.add(dto);
		}

		return dtoUser;
	}




}
