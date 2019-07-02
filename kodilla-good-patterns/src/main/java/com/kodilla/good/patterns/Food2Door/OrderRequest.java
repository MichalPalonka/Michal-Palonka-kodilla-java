package com.kodilla.good.patterns.Food2Door;

public class OrderRequest {
    private ProducentInterface producentInterface;
    private String order;
    private User user;
    private int orderQnt;

    public OrderRequest(ProducentInterface producentInterface, String order, User user, int orderQnt) {
        this.producentInterface = producentInterface;
        this.order = order;
        this.user = user;
        this.orderQnt = orderQnt;
    }

    public ProducentInterface getProducentInterface() {
        return producentInterface;
    }

    public String getOrder() {
        return order;
    }

    public User getUser() {
        return user;
    }

    public int getOrderQnt() {
        return orderQnt;
    }
}