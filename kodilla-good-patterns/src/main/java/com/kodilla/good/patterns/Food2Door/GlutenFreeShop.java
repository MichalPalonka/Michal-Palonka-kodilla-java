package com.kodilla.good.patterns.Food2Door;

public class GlutenFreeShop implements ProducentInterface {
    public boolean process(OrderRequest orderRequest) {
        System.out.println("GlutenFreeShop get order.");
        return new Realization().process(orderRequest);
    }
}
