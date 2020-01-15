package com.eleads.core.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController{

    @GetMapping("/")
	public String home(){

		return "index";
    }
    
    @GetMapping("/user")
	public String user(){

		return "index";
    }
    
    @GetMapping("/admin")
	public String admin(){

		return "index";
	}

}