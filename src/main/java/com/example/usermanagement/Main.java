package com.example.usermanagement;

import com.example.usermanagement.model.User;
import com.example.usermanagement.service.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.createUser(1L, "John Doe", "jd@email.com");
        userService.createUser(2L, "Jane Smith", "js@email.com");
        for (User user : userService.getUsers()) {
            System.out.println("User: " + user.name() + ", Email: " + user.email());
        }
    }
}

