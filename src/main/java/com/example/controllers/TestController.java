package com.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/")
	public String testService() {
		return "Server Accesible";
	}
	
	@RequestMapping("/api/v1/test")
	public String testService1() {
		return "Server Accesible";
	}
}
