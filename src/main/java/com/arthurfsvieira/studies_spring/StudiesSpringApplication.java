package com.arthurfsvieira.studies_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile("dev")
public class StudiesSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudiesSpringApplication.class, args);
	}

}
