package com.examples.angular.controllers;

import com.examples.angular.domain.User;
import com.examples.angular.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
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
    @Transactional
    public void addUser(@RequestBody User user) {
        log.info("Add user, hello from Angular!");
        userRepository.save(user);
    }

    @DeleteMapping("/users")
    @Transactional
    public void deleteAllUsers() {
        log.info("Delete all users!");
        userRepository.deleteAll();
    }

    @DeleteMapping("/users/{userId}")
    @Transactional
    public void deleteUserById(@PathVariable Long userId) {
        log.info("Delete user by id = {}", userId);
        userRepository.deleteById(userId);
    }
}
