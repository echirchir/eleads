package com.eleads.core.controllers;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HotelsController{

    @GetMapping("/myhotel")
    public String getAll() {
        return "dashboard";
    }
    
}