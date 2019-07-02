package com.kodilla.good.patterns.Food2Door;

public class Realization implements RealizationInterface{
    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("Ordered " + orderRequest.getOrder() + " is possible for shipment for " + orderRequest.getUser().getName() + " " + orderRequest.getUser().getLastName() + ".");
        return true;
    }
}
