package com.eleads.core;

import com.eleads.core.repositories.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan("com.eleads.core.controllers")
@EnableJpaRepositories(basePackageClasses = {CustomersRepository.class, HotelsRepository.class, RoomsRepository.class, RoomTypeRepository.class})
public class EleadsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EleadsApplication.class, args);
	}

}
