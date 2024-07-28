package com.ManagePro.app.Service;

import java.util.List;

import com.ManagePro.app.Dto.UserDto;
import com.ManagePro.app.entities.User;

public interface UserService {
	
	public User addUser(User user);

	public UserDto getUserById(long id);

	public List<UserDto> getAllUsersByUsername(String Username);
}
