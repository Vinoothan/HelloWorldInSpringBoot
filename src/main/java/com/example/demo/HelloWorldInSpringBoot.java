package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldInSpringBoot {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldInSpringBoot.class, args);
		System.out.println("Hello World");
	}

}
