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

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isSold = orderService.sold(orderRequest.getUser(),
                orderRequest.getOrderDate(),
                orderRequest.getProduct(),
                orderRequest.getQuantity());
        if(isSold) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(),
                    orderRequest.getOrderDate(),
                    orderRequest.getProduct(),
                    orderRequest.getQuantity());
            return new OrderDto(orderRequest.getUser(),
                    orderRequest.getOrderDate(),
                    orderRequest.getProduct(),
                    orderRequest.getQuantity(), true);
        } else {
            return new OrderDto(orderRequest.getUser(),
                    orderRequest.getOrderDate(),
                    orderRequest.getProduct(),
                    orderRequest.getQuantity(), false);
        }
    }
}

