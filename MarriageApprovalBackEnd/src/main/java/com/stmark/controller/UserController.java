package com.stmark.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stmark.model.User;
import com.stmark.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/login")
	public String doLogin(@Valid @RequestBody User user) {

		System.out.println("in login " + user.getUserName() + "  " + user.getPassword());

		User dbUser = userService.getByUserName(user.getUserName());
				
		if (dbUser != null && dbUser.getPassword().equals(user.getPassword())) {
			System.out.println(" login Successfully");
			return "{\"message\":\"Login Successfully\",\"role\":\""+dbUser.getRole()+"\"}";
		} else {
			System.out.println(" User Not Found");
			return "{\"message\":\"Login failed\"}";
		}
	}

	// Get All users
	@GetMapping("/getAllUsers")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
}
