package com.example.springboot.service;

import java.util.List;

import com.example.springboot.model.Product;

public interface ProductService {
    void insertProduct(Product product);

    void deleteProductById(String productId);

    List<Product> listProducts();
}