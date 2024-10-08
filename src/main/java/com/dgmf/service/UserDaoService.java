package com.dgmf.service;

import com.dgmf.entity.User;

import java.util.List;

public interface UserDaoService {
    List<User> findAll();
    User findOneById(int userId);
    User saveUser(User user);
    void deleteOneById(int userId);
}
