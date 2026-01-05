package com.example.usermanagement.service;

import com.example.usermanagement.model.User;
import com.example.usermanagement.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserService {

    private UserRepository userRepository = new UserRepository();

    public void createUser(Long id, String name, String email) {
        var user = new User(id, name, email);
        this.userRepository.save(user);
    }

    public List<User> getUsers() {
        return this.userRepository.listAll();
    }

    public Optional<User> getUserById(Long id) {
        return this.userRepository.findById(id);
    }
}
