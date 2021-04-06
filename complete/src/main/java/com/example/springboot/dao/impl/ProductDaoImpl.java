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

import com.example.springboot.dao.ProductDao;
import com.example.springboot.model.Product;

@Repository
public class ProductDaoImpl extends JdbcDaoSupport implements ProductDao {

    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    @Override
    public void insertProduct(Product product) {
        String sql = "INSERT INTO product " + "(productId, productName) VALUES (?, ?)";
        getJdbcTemplate().update(sql, new Object[] { product.getProductId(), product.getProductName() });
    }

    @Override
    public List<Product> listProducts() {
        List<Product> productsList = new ArrayList<Product>();
        String sql = "SELECT * FROM product";
        productsList = getJdbcTemplate().query(sql,
                new BeanPropertyRowMapper(Product.class));
        return productsList;
    }

    @Override
    public void deleteProductById(String productId) {
        String sql = "DELETE FROM product WHERE productId = ?";
        getJdbcTemplate().update(sql, new Object[] { productId });

    }
}