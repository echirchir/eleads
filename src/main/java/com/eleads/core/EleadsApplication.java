package com.eleads.core;

import com.eleads.core.repositories.UserRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class EleadsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EleadsApplication.class, args);
	}

}
