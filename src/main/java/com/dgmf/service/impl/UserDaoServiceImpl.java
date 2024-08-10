package com.dgmf.service.impl;

import com.dgmf.entity.User;
import com.dgmf.service.UserDaoService;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoServiceImpl implements UserDaoService {
    private static List<User> users = new ArrayList<>();
    static {
        users.add(new User(
                1, "Adam", LocalDate.now().minusYears(30)
            )
        );
        users.add(new User(
                2, "Eve", LocalDate.now().minusYears(25)
            )
        );
        users.add(new User(
                3, "Jim", LocalDate.now().minusYears(20)
            )
        );
    }

    public List<User> findAll() {
        return users;
    }
}
