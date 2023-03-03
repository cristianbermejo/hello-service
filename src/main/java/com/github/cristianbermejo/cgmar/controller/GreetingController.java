package com.github.cristianbermejo.cgmar.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@GetMapping(value = "greet", produces = MediaType.TEXT_PLAIN_VALUE)
	public String greeting() {
		return "Welcome to REST";
	}
}