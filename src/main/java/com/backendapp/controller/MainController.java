package com.backendapp.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class MainController {

	@GetMapping("/")
	public String test() {
		return "hola test 2";
	}

	
	
}
