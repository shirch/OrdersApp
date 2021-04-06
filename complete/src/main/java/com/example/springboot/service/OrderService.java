package com.example.springboot.service;

import com.example.springboot.model.Order;

public interface OrderService {
    void newOrder(Order order);

    void cancelOrderById(String orderId);
}