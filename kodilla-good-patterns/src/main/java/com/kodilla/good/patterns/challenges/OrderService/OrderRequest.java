package com.kodilla.good.patterns.challenges.OrderService;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime orderDate;
    private Product product;
    private int quantity;
    private boolean isSold;

    public OrderRequest(User user, LocalDateTime orderDate, Product product, int quantity, final boolean isSold) {
        this.user = user;
        this.orderDate = orderDate;
        this.product = product;
        this.quantity = quantity;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
    public boolean getIsSold() {
        return isSold;
    }
}
