package com.example.persistance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserPersistance {
	
	@Autowired
	UserRepository userRepository;
	
	public List<UserPersistancePojo> findByName(String name) {
		List<UserPersistancePojo> users = userRepository.findByName(name);
		users.forEach(System.out::println);
		return users;
	}

	
}
