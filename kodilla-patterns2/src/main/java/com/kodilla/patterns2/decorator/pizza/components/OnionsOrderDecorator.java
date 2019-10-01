package com.kodilla.patterns2.decorator.pizza.components;

import com.kodilla.patterns2.decorator.pizza.AbstractPizzaOrderDecorator;
import com.kodilla.patterns2.decorator.pizza.PizzaOrder;

import java.math.BigDecimal;

public class OnionsOrderDecorator extends AbstractPizzaOrderDecorator {
    public OnionsOrderDecorator (PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(1));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " + onions";
    }
}
