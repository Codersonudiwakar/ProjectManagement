package com.ManagePro.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ManagePro.app.Service.TaskService;
import com.ManagePro.app.Service.UserService;
import com.ManagePro.app.entities.User;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class UserController {
	
	@Autowired
    private UserService userService;
	
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		System.out.println(user.getUserName());
		System.out.println(user.getUserProfile());
		return userService.addUser(user);
	}

	@GetMapping("/getUser")
	public User getUserById(long id) {
		// TODO Auto-generated method stub
		return userService.getUserById(id);
	}

	
	@GetMapping("/allUser/{username}")
	public List<User> getAllUsers(@PathVariable String username) {
		List<User> userList=userService.getAllUsersByUsername(username);
		return userList;
	}

}
