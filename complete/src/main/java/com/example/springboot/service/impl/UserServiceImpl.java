package com.example.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springboot.dao.UserDao;
import com.example.springboot.model.User;
import com.example.springboot.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Transactional
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    @Transactional
    public void deleteUserById(String userId) {
        userDao.deleteUserById(userId);
    }

    @Transactional(readOnly = true)
    public List<User> listUsers() {
        return this.userDao.listUsers();
    }
}
