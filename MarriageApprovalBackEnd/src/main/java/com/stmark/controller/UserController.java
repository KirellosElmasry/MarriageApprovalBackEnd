package com.stmark.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stmark.exception.ResourceNotFoundException;
import com.stmark.model.User;
import com.stmark.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserRepository userRepository;

	@PostMapping("/login")
	public String doLogin(@Valid @RequestBody User user) {

		System.out.println("in login " + user.getUserName() + "  " + user.getPassword());

		User dbUser = userRepository.findById(user.getUserName())
				.orElseThrow(() -> new ResourceNotFoundException("User", "userName", user.getUserName()));

		if (dbUser != null && dbUser.getPassword().equals(user.getPassword())) {
			System.out.println(" login Successfully");
			return "{'message':'Login Successfully'}";
		} else {
			System.out.println(" User Not Found");
			return "{'message':'User Not Found'}";
		}
	}

	// Get All persons
	@GetMapping("/getUser")
	public String getAllPersons() {
		return "return $$$";
	}
}
