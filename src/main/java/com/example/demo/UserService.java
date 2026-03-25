package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepository repo;

	public User register(User user) {
		System.out.println(user.getFullName());
	    return repo.save(user);
	}

	public String login(User request) {

	    User user = repo.findByEmail(request.getEmail());

	    if (user == null) {
	        return "user not found";
	    }

	    // compare password
	    if (user.getPasswordHash().equals(request.getPasswordHash())) {
	        return "logged in success";
	    }

	    return "auth failed";
	}
}
