package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoPipeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoPipeApplication.class, args);
		
		
		}
		
	public String hi() {
		
		return "hi";
	}
}
