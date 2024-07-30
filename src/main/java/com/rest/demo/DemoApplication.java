package com.rest.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	@Autowired
	private MeetingRepo meetingRepo;

	@PostMapping("/addMeeting")
	public Meeting addMeeting(@RequestBody Meeting Meeting) {
		return meetingRepo.save(meeting);
	}

	@GetMapping("/getData")
	public List<Meeting> getUser(){
		return meetingRepo.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}
}





