package com.kodilla.good.patterns.Food2Door;

public class HealthyShop implements ProducentInterface {
    public boolean process(OrderRequest orderRequest) {
        System.out.println("HealthyShop get order.");
        return new Realization().process(orderRequest);
    }
}
