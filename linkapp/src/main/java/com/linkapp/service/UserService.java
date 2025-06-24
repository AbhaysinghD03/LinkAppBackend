package com.linkapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.linkapp.entity.User;
import com.linkapp.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public User loginUser(User request) {
		
		Optional<User> optionalUser = userRepository.findByUsername(request.getUsername());
		if(optionalUser.isPresent()) {
			User user = optionalUser.get();
			if(passwordEncoder.matches(request.getPassword(),user.getPassword())) {
				return user;
			}
		}
		return null;
	}

	public User registerUser(User user) {
		Optional<User> existingUser = userRepository.findByUsername(user.getUsername());
		if(existingUser.isPresent()) {
			return null;
		}
		
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}

}
