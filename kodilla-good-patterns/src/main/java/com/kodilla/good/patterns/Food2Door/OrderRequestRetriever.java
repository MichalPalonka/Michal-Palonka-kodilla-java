package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;

public class OrderRequestRetriever {
    public OrderRequest getOrder() {
        HashMap<Product, Integer> order = new HashMap<>();
        order.put(new Product("Bread"), 1);
        User user = new User("Adam", "Adamek", 8255522,
                "Adamowice 3/5", "AdamAdamek@gmail.com");

    return new OrderRequest(new HealthyShop(), order, user);
    }
}
