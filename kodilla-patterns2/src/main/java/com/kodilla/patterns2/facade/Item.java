package com.kodilla.patterns2.facade;

public class Item {
    private final Long prductId;
    private final double qty;

    public Item(Long prductId, double qty) {
        this.prductId = prductId;
        this.qty = qty;
    }

    public Long getPrductId() {
        return prductId;
    }

    public double getQty() {
        return qty;
    }
}
