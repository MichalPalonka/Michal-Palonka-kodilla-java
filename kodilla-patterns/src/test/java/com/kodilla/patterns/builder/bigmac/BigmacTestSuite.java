package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void BigmacTestSuite() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .burgers(1)
                .bun("sesame bum")
                .ingredient("lettuce")
                .ingredient("bacon")
                .ingredient("onion")
                .ingredient("cucumber")
                .ingredient("shrimps")
                .ingredient("cheese")
                .sauce("barbecue")
                .ingredient("mushrooms")
                .ingredient("chilli peppers")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(8, howManyIngredients);
    }
}
