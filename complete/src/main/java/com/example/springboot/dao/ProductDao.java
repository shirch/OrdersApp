package com.example.springboot.dao;

import java.util.List;

import com.example.springboot.model.Product;

public interface ProductDao {
    void insertProduct(Product product);

    List<Product> listProducts();

    void deleteProductById(String productId);
}