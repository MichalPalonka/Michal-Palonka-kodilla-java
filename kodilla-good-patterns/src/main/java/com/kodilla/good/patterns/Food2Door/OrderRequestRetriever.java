package com.kodilla.good.patterns.Food2Door;

public class OrderRequestRetriever {
    public OrderRequest getOrder() {
        String order = "milk EFS";
        int orderQnt = 5;
        User user = new User("Adam", "Adamek", 8255522,
                "Adamowice 3/5", "AdamAdamek@gmail.com");

        CheckProducent checkProducent = new CheckProducent();
        ProducentInterface producentInterface = checkProducent.checker(order);

        System.out.println(user.getName()+" "+ user.getLastName() +" order "+ orderQnt + " " + order);
            return new OrderRequest(producentInterface, order, user, orderQnt);
    }
}
