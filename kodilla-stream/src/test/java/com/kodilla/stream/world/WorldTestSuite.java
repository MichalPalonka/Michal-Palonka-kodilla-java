package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();

        Continent europa = new Continent("Europa");
        Continent northAmerica = new Continent("North America");

        Country germany = new Country("Germany", new BigDecimal("82438639"));
        Country unitedKingdom = new Country("United Kingdom", new BigDecimal("66959016"));
        Country france = new Country("France", new BigDecimal("65480710"));
        Country italy = new Country("Italy", new BigDecimal("59216525"));
        Country unitedStates = new Country("United States", new BigDecimal("321215487"));
        Country mexico = new Country("Mexico", new BigDecimal("121147854"));
        Country canada = new Country("Canada", new BigDecimal("35815487"));
        Country guatemala = new Country("Guatemala", new BigDecimal("16155547"));

        world.addContinent(europa);
        world.addContinent(northAmerica);

        europa.addCountry(germany);
        europa.addCountry(unitedKingdom);
        europa.addCountry(france);
        europa.addCountry(italy);

        northAmerica.addCountry(unitedStates);
        northAmerica.addCountry(mexico);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(guatemala);

        //When

        BigDecimal totalPeople = world.getPeopleQuantity();
        //Then
        BigDecimal totalPeopleExpected = new BigDecimal("768429265");
        Assert.assertEquals(totalPeopleExpected, totalPeople);
    }
}
