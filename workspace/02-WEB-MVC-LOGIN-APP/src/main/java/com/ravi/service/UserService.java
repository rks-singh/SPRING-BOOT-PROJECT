package com.ravi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravi.binding.UserBinding;
import com.ravi.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void storeUser(UserBinding userBinding) {
		userRepository.save(userBinding);
	}
	
	public String getUserEmail(String email) {
		return userRepository.getUserEmail(email);
	}
	
	public String getUserPassword(String password) {
		return userRepository.getUserPassword(password);
	}
}
