package com.kodilla.good.patterns.Food2Door;

public class ExtraFoodShop implements ProducentInterface {
    public boolean process(OrderRequest orderRequest) {
        System.out.println("ExtraFoodShop get order.");
        return true;
    }
}
