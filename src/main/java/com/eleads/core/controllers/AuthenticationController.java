package com.eleads.core.controllers;

import com.eleads.core.models.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public ModelAndView register(Model model){

        ModelAndView registerView = new ModelAndView();
        User user = new User();
        registerView.addObject("user", user);
        registerView.setViewName("register");

		return registerView;
    }
}