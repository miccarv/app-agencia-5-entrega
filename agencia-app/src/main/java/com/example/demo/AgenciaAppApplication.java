package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@EnableAutoConfiguration
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class AgenciaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgenciaAppApplication.class, args);
	}

}
