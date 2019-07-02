package com.kodilla.good.patterns.Food2Door;

public class Food2DoorProcessor {
    public static void main(String[] args) {
        OrderRequestRetriever requestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = requestRetriever.getOrder();

        OrderProcessor orderProcessor = new OrderProcessor(orderRequest);

        if(orderProcessor.process()) {
            System.out.println("Order accepted. ");
        } else {
            System.out.println("Order not accepted.");
        }
    }
}
