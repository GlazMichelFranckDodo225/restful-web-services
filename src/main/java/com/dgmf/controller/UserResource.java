package com.dgmf.controller;

import com.dgmf.entity.User;
import com.dgmf.service.UserDaoService;
import com.dgmf.service.impl.UserDaoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
