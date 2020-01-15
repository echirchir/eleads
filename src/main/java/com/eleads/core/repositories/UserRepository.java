package com.eleads.core.repositories;

import java.util.Optional;

import com.eleads.core.models.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{

    Optional<User> findByUserName(String username);

}