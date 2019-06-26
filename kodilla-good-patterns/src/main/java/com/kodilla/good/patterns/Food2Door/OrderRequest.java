package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;

public class OrderRequest {
    private ProducentInterface producentInterface;
    private HashMap<Product, Integer> order;
    private User user;

    public OrderRequest(ProducentInterface producentInterface, HashMap<Product, Integer> order, User user) {
        this.producentInterface = producentInterface;
        this.order = order;
        this.user = user;
    }

    public ProducentInterface getProducentInterface() {
        return producentInterface;
    }

    public HashMap<Product, Integer> getOrder() {
        return order;
    }

    public User getUser() {
        return user;
    }
}
