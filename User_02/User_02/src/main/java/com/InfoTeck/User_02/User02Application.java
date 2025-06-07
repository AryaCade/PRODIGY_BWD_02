package com.InfoTeck.User_02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class User02Application {

	public static void main(String[] args) {
		SpringApplication.run(User02Application.class, args);
		
		// Dotenv dotenv = Dotenv.configure().load();
	     //   System.setProperty("spring.data.mongodb.uri", dotenv.get("MONGO_URI"));
	     //   SpringApplication.run(User02Application.class, args);
	}

}
