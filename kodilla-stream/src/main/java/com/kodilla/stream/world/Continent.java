package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final List<Country> countries = new ArrayList<>();
    private final String continent;

    public Continent(final String continentName) {
        this.continent = continentName;
    }

    public List<Country> getCountries() {
        return countries ;
    }
    public boolean addCountry(Country country){
        return countries.add(country);
    }

}
