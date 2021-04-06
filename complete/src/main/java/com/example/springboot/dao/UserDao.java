package com.example.springboot.dao;

import java.util.List;

import com.example.springboot.model.User;

public interface UserDao {
    void insertUser(User user);

    List<User> listUsers();

    void deleteUserById(String userId);
}