package com.linkapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.linkapp.entity.User;
import com.linkapp.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins="http://localhost:4200")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/login-user")
	public ResponseEntity<String> loginUser(@RequestBody User request) {
		User loginUser = userService.loginUser(request);
		
		if(loginUser != null) {
			return ResponseEntity.status(HttpStatus.OK).body("Login Successfully");
		}else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
		}
		
	}
	
	@PostMapping("/register-user")
	public ResponseEntity<String> registerUser(@RequestBody User user){
		User registerUser = userService.registerUser(user);
		if(registerUser != null) {
			return ResponseEntity.status(HttpStatus.CREATED).body("User Registered Successfully");
		} else {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("User Already Exists");
		}
		
	}
	
//	@DeleteMapping("/delete-user")
//	public void deleteUser() {
//		
//	}
}
