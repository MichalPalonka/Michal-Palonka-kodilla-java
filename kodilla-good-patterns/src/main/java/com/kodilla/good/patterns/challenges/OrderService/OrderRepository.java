package com.kodilla.good.patterns.challenges.OrderService;

public interface OrderRepository {
    boolean save(OrderRequest orderRequest);
}