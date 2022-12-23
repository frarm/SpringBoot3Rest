package com.domo.demo.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int usersCount = 0;
    static {
        users.add(new User(++usersCount, "Franco", LocalDate.now().minusYears(29)));
        users.add(new User(++usersCount, "Luis", LocalDate.now().minusYears(26)));
        users.add(new User(++usersCount, "Carlos", LocalDate.now().minusYears(26)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(int id ){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User save(User user){
        user.setId(++usersCount);
        users.add(user);
        return user;
    }
}
