package com.example.springboot.service;

import java.util.List;

import com.example.springboot.model.User;

public interface UserService {
    void insertUser(User user);

    void deleteUserById(String userId);

    List<User> listUsers();
}