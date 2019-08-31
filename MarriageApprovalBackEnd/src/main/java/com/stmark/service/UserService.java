package com.stmark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stmark.model.User;
import com.stmark.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User getByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
}
