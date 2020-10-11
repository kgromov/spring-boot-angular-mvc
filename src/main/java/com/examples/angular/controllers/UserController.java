package com.examples.angular.controllers;

import com.examples.angular.domain.User;
import com.examples.angular.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @GetMapping("/users")
    public Iterable<User> getUsers() {
        log.info("View users, hello from Angular!");
        return userRepository.findAll();
    }

    @PostMapping("/users")
    public void addUser(@RequestBody User user) {
        log.info("Add user, hello from Angular!");
        userRepository.save(user);
    }
}