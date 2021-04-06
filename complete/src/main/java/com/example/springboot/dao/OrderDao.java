package com.example.springboot.dao;

import com.example.springboot.model.Order;

public interface OrderDao {
    void newOrder(Order order);

    void cancelOrderById(String orderId);
}
