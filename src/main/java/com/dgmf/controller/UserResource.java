package com.dgmf.controller;

import com.dgmf.entity.User;
import com.dgmf.service.UserDaoService;
import com.dgmf.service.impl.UserDaoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserResource {
    private final UserDaoService userDaoService;

    // Get All Users REST API
    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return userDaoService.findAll();
    }

    // Get User By Id REST API
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable("id") int userId) {
        return userDaoService.findOneById(userId);
    }

    // Create User REST API
    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = userDaoService.saveUser(user);
        // "/users/4" => "/users/" + "user.getId"
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }
}
