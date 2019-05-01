package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final List<Country> countrys = new ArrayList<>();
    private final String continent;

    public Continent(final String continentName) {
        this.continent = continentName;
    }

    public List<Country> getCountrys() {
        return countrys;
    }
    public boolean addCountry(Country country){
        return countrys.add(country);
    }

}
