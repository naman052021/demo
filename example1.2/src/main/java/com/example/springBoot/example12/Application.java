package com.example.springBoot.example12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication                     //this is a spring context,component scan,auto confrgration
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
