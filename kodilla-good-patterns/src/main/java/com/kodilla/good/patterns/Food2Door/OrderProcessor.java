package com.kodilla.good.patterns.Food2Door;

public class OrderProcessor {
    private OrderRequest orderRequest;

    public OrderProcessor(OrderRequest orderRequest) {
        this.orderRequest = orderRequest;
    }

    public boolean process() {
        return orderRequest.getProducentInterface().process(orderRequest);
    }
}
