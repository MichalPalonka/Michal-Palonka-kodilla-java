package com.kodilla.good.patterns.challenges.OrderService;

import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {
        User userAdam = new User("Adam", "Adamczyk", "Samczyk");
        LocalDateTime orderDate = LocalDateTime.of(2019,6,25, 22,6);
        Product ball = new Product("Ball", 10);

        InformationService informationService = new InformationService() {
            @Override
            public void inform(User user) {
                System.out.println(user.getUserName() + " order confirm.");
            }
        };

        OrderService orderService = new OrderService() {
            @Override
            public boolean sold(User user, LocalDateTime orderDate, Product product, int quantity) {
                return false;
            }
        };

        OrderRepository orderRepository = new OrderRepository() {
            @Override
            public boolean createOrder(User user, LocalDateTime orderDate, Product product, int quantity) {
                return false;
            }
        };

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(informationService, orderService, orderRepository);
        OrderRequest orderRequest = new OrderRequest(userAdam, orderDate, ball, 1, false);
        productOrderProcessor.process(orderRequest);
    }
}
