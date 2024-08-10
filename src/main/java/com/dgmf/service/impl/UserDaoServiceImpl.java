package com.dgmf.service.impl;

import com.dgmf.entity.User;
import com.dgmf.service.UserDaoService;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoServiceImpl implements UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int userCount = 0;
    static {
        users.add(new User(
                ++userCount, "Adam", LocalDate.now().minusYears(30)
            )
        );
        users.add(new User(
                ++userCount, "Eve", LocalDate.now().minusYears(25)
            )
        );
        users.add(new User(
                ++userCount, "Jim", LocalDate.now().minusYears(20)
            )
        );
    }

    public List<User> findAll() {
        return users;
    }

    public User findOneById(int userId) {
        Predicate<? super User> predicate = user -> user.getId().equals(userId);

        return users.stream().filter(predicate).findFirst().get();
    }

    @Override
    public User saveUser(User user) {
        user.setId(++userCount);
        users.add(user);

        return user;
    }
}
