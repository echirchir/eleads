package com.eleads.core.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class HotelsController{
    
    @GetMapping(value="/")
    public String getAll() {
        return "All hotels";
    }

    @GetMapping(value="/{id}")
    public String getById() {
        return "All hotels";
    }
    
}