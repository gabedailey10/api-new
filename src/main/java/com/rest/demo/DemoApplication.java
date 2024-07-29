package com.rest.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	@Autowired
	private UserRepo userRepo;

	public User addUser(@RequestBody User user) {
		return userRepo.save(user);
	}

	@GetMapping("/getData")
	public List<User> getUser(){
		return userRepo.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}
}





