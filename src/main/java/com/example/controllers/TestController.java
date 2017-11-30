package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.repository.MapId;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.persistance.UserPersistancePojo;
import com.example.persistance.UserRepository;

@RestController
public class TestController {
	
	@Autowired
	UserRepository userRepository;

	@RequestMapping("/")
	public String testService() {
		return "Server Accesible";
	}
	
	@RequestMapping("/api/v1/test")
	public String testService1() {
		return "Server Accesible";
	}
	
	@PostMapping("/save")
	public UserPersistancePojo insertData(@RequestBody UserPersistancePojo pojo) {
		
		return userRepository.save(pojo);
	}
	
	@DeleteMapping("/delete")
	public String deletetData(@RequestParam("id") MapId id) {
		
		 userRepository.delete(id);
		 
		 return "Successfully deleted id :"+id;
		 
	}
}
