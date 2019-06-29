package com.kodilla.good.patterns.challenges.OrderService;

public class MessageToUser implements InformationService {
    public boolean send(OrderRequest orderRequest) {
        System.out.println("Pigeon send to " + orderRequest.getUser().getName()+".");
        return true;
    }
}
