package com.kodilla.good.patterns.challenges.OrderService;

public class ProductOrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderProcessor(final InformationService informationService,
                                 final OrderService orderService,
                                 final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public void process(final OrderRequest orderRequest) {
        if(!orderRequest.getProduct().getName().isEmpty() || !orderRequest.getUser().getName().isEmpty() || orderRequest.getQuantity() == 0) {
            orderService.toDo(orderRequest);
            orderRepository.save(orderRequest);
            informationService.send(orderRequest);
        }
    }
}

