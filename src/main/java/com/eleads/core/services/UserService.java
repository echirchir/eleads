package com.eleads.core.services;

import java.util.Optional;

import com.eleads.core.models.User;
import com.eleads.core.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    @Autowired
    private UserRepository userRepository;

    public Optional<User> findByUserName(String username){

        return userRepository.findByUserName(username);
    }
}