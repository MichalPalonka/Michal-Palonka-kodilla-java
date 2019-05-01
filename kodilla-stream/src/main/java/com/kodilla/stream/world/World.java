package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continentsOnWorld = new ArrayList<>();

    public boolean addContinent(Continent continent){
        return continentsOnWorld.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = continentsOnWorld.stream()
                .flatMap(continent -> continent.getCountryOnContinet().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum,country) -> sum.add(country));
        return peopleQuantity;
    }
}
