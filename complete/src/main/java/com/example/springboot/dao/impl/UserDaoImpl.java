package com.example.springboot.dao.impl;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.example.springboot.dao.UserDao;
import com.example.springboot.model.User;

@Repository
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {

    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    @Override
    public void insertUser(User user) {
        String sql = "INSERT INTO user " + "(userId, userName) VALUES (?, ?)";
        getJdbcTemplate().update(sql, new Object[] { user.getUserId(), user.getUserName() });
    }

    @Override
    public List<User> listUsers() {
        List<User> usersList = new ArrayList<User>();
        String sql = "SELECT * FROM user";
        usersList = getJdbcTemplate().query(sql,
                new BeanPropertyRowMapper(User.class));
        return usersList;
    }

    @Override
    public void deleteUserById(String userId) {
        String sql = "DELETE FROM user WHERE userId = ?";
        getJdbcTemplate().update(sql, new Object[] { userId });

    }
}