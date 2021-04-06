package com.example.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.dao.OrderDao;
import com.example.springboot.model.Order;
import com.example.springboot.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderDao orderDao;

    @Override
    public void newOrder(Order order) { orderDao.newOrder(order);
    }

    @Override
    public void cancelOrderById(String orderId) {
        orderDao.cancelOrderById(orderId);
    }

}