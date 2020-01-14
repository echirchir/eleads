package com.eleads.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class EleadsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EleadsApplication.class, args);
	}

	@GetMapping("/")
	public String home(){

		return "index";
	}


}
