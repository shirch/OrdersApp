package com.example.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springboot.dao.ProductDao;
import com.example.springboot.model.Product;
import com.example.springboot.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;

    @Transactional
    public void insertProduct(Product product) {
        productDao.insertProduct(product);
    }

    @Transactional
    public void deleteProductById(String productId) {
        productDao.deleteProductById(productId);
    }

    @Transactional(readOnly = true)
    public List<Product> listProducts() {
        return this.productDao.listProducts();
    }
}