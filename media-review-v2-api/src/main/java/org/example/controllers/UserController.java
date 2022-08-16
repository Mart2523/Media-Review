package org.example.controllers;

import org.example.models.Data.UserRepository;
import org.example.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/users/register")
    public User registerUser(@RequestBody User newUser) {
       return userRepository.save(newUser);

    }

}
