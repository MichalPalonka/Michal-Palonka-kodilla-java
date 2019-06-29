package com.kodilla.good.patterns.challenges.OrderService;

public class Notebook implements OrderRepository {
    public boolean save(OrderRequest orderRequest){
        System.out.println("Order saved in Notebook.");
        return true;
    }
}
