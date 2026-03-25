package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping("/users/register")
	public ResponseEntity<String> Regsiter(){
		return new ResponseEntity<String>("this is the register Page",HttpStatus.OK);
	}
	
	@PostMapping("/users/register")
	public ResponseEntity<String> register(@RequestBody User user) {
		if(!service.register(user).equals(null)) {
	    return ResponseEntity.status(HttpStatus.CREATED)
	            .body("registered success");
		}
		throw new RuntimeException("error");
	}
	
	@PostMapping("/users/login")
	public ResponseEntity<String> login(@RequestBody User user) {
	    String result = service.login(user);
	    return ResponseEntity.ok(result);
	}
   
   
}
