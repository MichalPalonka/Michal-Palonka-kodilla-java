package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final List<Country> countryOnContinet = new ArrayList<>();
    private final String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public List<Country> getCountryOnContinet() {
        return countryOnContinet;
    }
    public boolean addCountry(Country country){
        return countryOnContinet.add(country);
    }

}
