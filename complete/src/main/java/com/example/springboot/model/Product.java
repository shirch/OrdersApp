package com.example.springboot.model;
public class Product {

    private String productId;
    private String productName;
    private int amount;
    private int priceInCents;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    public void setPriceInCents(int priceInCents) {
        this.priceInCents = priceInCents;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + ", productName=" + productName + "]";
    }

}