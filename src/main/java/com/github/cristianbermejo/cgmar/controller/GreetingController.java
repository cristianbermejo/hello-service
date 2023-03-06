package com.github.cristianbermejo.cgmar.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.github.cristianbermejo.cgmar.model.Info;

@RestController
public class GreetingController {

	@GetMapping(value = "greet", produces = MediaType.TEXT_PLAIN_VALUE)
	public String greeting() {
		return "Welcome to REST";
	}
	
	@GetMapping(value = "greet/{n}", produces = MediaType.TEXT_PLAIN_VALUE)
	public String greeting(@PathVariable("n") String name) {
		return "Welcome to REST Mr./Mrs. " + name;
	}
	
	@GetMapping(value = "clientinfo", produces = MediaType.APPLICATION_JSON_VALUE)
	public Info information() {
		return new Info("Test", 30, "test@gmail.com");
	}
}
