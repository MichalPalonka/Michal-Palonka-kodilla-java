package com.kodilla.patterns2.decorator.taxiportal;

import com.kodilla.patterns2.decorator.pizza.BasicPizzaOrder;
import com.kodilla.patterns2.decorator.pizza.PizzaOrder;
import com.kodilla.patterns2.decorator.pizza.components.*;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testOrderBasicPizzaGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal theCost = theOrder.getCost();
        System.out.println(theOrder.getCost());
        //Then
        assertEquals(new BigDecimal(15), theCost);
    }
    @Test
    public void testOrderBasicPizzaGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        System.out.println(theOrder.getDescription());
        //Then
        assertEquals("Ordered basic pizza", description);
    }
    @Test
    public void testOrderPizzaWithFiveComponetsGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseOrderDecorator(theOrder);
        theOrder = new MushroomsOrderDecorator(theOrder);
        theOrder = new OnionsOrderDecorator(theOrder);
        theOrder = new PepperoniOrderDecorator(theOrder);
        theOrder = new SausageOrderDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(30), theCost);
    }

    @Test
    public void testOrderPizzaWithFiveComponetsGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseOrderDecorator(theOrder);
        theOrder = new MushroomsOrderDecorator(theOrder);
        theOrder = new OnionsOrderDecorator(theOrder);
        theOrder = new PepperoniOrderDecorator(theOrder);
        theOrder = new SausageOrderDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Ordered basic pizza + extra cheese + mushrooms + onions + pepperoni + sausage", description);
    }

    @Test
    public void testOrderPizzaWithOneComponetFiveTimesGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseOrderDecorator(theOrder);
        theOrder = new ExtraCheeseOrderDecorator(theOrder);
        theOrder = new ExtraCheeseOrderDecorator(theOrder);
        theOrder = new ExtraCheeseOrderDecorator(theOrder);
        theOrder = new ExtraCheeseOrderDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(40), theCost);
    }

    @Test
    public void testOrderPizzaOneComponetFiveTimesGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseOrderDecorator(theOrder);
        theOrder = new ExtraCheeseOrderDecorator(theOrder);
        theOrder = new ExtraCheeseOrderDecorator(theOrder);
        theOrder = new ExtraCheeseOrderDecorator(theOrder);
        theOrder = new ExtraCheeseOrderDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Ordered basic pizza + extra cheese + extra cheese + extra cheese + extra cheese + extra cheese", description);
    }
}
