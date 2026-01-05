package com.example.usermanagement.repository;

import com.example.usermanagement.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    private List<User> users = new ArrayList<>();

    public void save(User user) {
        this.users.add(user);
    }

    public List<User> listAll() {
        return this.users;
    }

    public Optional<User> findById(Long id) {
        return users.stream()
                .filter(user -> user.id().equals(id))
                .findFirst();
    }
}
