package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		Hello hello = new Hello();
		
		SpringApplication.run(TestApplication.class, args);
	}

}
