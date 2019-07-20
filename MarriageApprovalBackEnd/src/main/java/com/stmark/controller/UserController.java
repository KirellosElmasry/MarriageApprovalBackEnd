package com.stmark.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stmark.exception.ResourceNotFoundException;
import com.stmark.model.User;
import com.stmark.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	// Get a user by name
		@GetMapping("/user/{name}")
		public User getUserByName(@PathVariable(value = "name") String name) {
			// it will return a 404 Not Found error to the client if EId doesn't exist
			return userRepository.findById(name)
					.orElseThrow(() -> new ResourceNotFoundException("User", "userName", name));

		}
}
