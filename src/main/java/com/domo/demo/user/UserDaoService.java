package com.domo.demo.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    static {
        users.add(new User(1, "Franco", LocalDate.now().minusYears(29)));
        users.add(new User(2, "Luis", LocalDate.now().minusYears(26)));
        users.add(new User(3, "Carlos", LocalDate.now().minusYears(26)));
    }

    public List<User> findAll() {
        return users;
    }
}
