package com.kodilla.good.patterns.challenges.OrderService;

public class OrderToDo implements OrderService {
    @Override
    public boolean toDo(OrderRequest orderRequest) {
        System.out.println(orderRequest.getProduct().getName() + " ordered for delivery.");
        return true;
    }
}
