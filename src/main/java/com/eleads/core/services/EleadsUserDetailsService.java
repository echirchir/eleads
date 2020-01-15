package com.eleads.core.services;

import java.util.Optional;

import com.eleads.core.models.EleadsUserDetails;
import com.eleads.core.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class EleadsUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService service;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        Optional<User> user = service.findByUserName(username);

        user.orElseThrow(() -> new UsernameNotFoundException("User Not found: " + username));

        return user.map(EleadsUserDetails::new).get();

    }

    
}