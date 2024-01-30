package com.test.pLesson37;

import java.util.Arrays;
import java.util.List;

public class UserRepository implements Repository {
    private List<User> users;

    public UserRepository() {
        this.users = Arrays.asList(
                new User("guest", "GUEST"),
                new User("user", "USER"),
                new User("admin", "ADMIN")
        );
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }

    @Override
    public User getUserByUsername(String username) throws Exception{
        return users.stream()
                .filter(user -> user.getUsername().equals(username))
                .findAny()
                .orElse(null);
    }
}
