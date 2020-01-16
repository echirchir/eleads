package com.eleads.core.controllers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@ComponentScan
public class HomeController{

    @GetMapping("/")
	public String home(){

		return "index";
	}
    
    @GetMapping("/user")
	public String user(){

		return "customer";
    }
    
    @GetMapping("/admin")
	public String admin(){

		return "dashboard";
	}

}