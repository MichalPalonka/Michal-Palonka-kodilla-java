package com.kodilla.good.patterns.FlightFinder;
import java.util.*;

public class Airport {
    private String name;
    private List<Airport> possibleFlight = new ArrayList<>();

    public Airport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Airport> getPossibleFlight() {
        return possibleFlight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airport = (Airport) o;

        return name.equals(airport.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public void addPossibleFlight(Airport airport) {
        possibleFlight.add(airport);
    }
}
