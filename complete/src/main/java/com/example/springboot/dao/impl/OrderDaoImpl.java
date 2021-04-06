package com.example.springboot.dao.impl;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.springboot.dao.OrderDao;
import com.example.springboot.model.Order;

@Repository
public class OrderDaoImpl extends JdbcDaoSupport implements OrderDao {

    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    @Override
    public void newOrder(Order order) {
        String sql = "INSERT INTO order " + "(userId, productId) VALUES (?, ?)";
        getJdbcTemplate().update(sql, new Object[] { order.getUserId(), order.getProductId() });
    }

    @Override
    public void cancelOrderById(String orderId) {
        String sql = "DELETE FROM order WHERE orderId = ?";
        getJdbcTemplate().update(sql, new Object[] { orderId });

    }
}
