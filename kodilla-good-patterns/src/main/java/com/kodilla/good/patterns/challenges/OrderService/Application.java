package com.kodilla.good.patterns.challenges.OrderService;


public class Application {
    public static void main(String[] args) {
        OrderRequest orderRequest = new OrderRequest(new User("Adam", "Adamowicz", "AdAdam"),
                new Product("Agd", 1000), 5);

        ProductOrderProcessor orderProcessor = new ProductOrderProcessor(new MessageToUser(), new OrderToDo(), new Notebook());
        orderProcessor.process(orderRequest);
    }
}
