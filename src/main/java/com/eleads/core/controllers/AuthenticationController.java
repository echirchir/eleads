package com.eleads.core.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthenticationController{

    @GetMapping("/login")
	public ModelAndView login(){

        ModelAndView loginView = new ModelAndView();
        loginView.setViewName("login");

		return loginView;
    }

    @GetMapping("/register")
	public ModelAndView register(){

		ModelAndView registerView = new ModelAndView();
        registerView.setViewName("register");

		return registerView;
    }
}