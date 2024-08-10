package com.dgmf.service;

import com.dgmf.entity.User;

import java.util.List;

public interface UserDaoService {
    List<User> findAll();
}
