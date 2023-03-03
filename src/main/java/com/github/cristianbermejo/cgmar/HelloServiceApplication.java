package com.github.cristianbermejo.cgmar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.github.cristianbermejo.cgmar.controller")
public class HelloServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloServiceApplication.class, args);
	}

}
