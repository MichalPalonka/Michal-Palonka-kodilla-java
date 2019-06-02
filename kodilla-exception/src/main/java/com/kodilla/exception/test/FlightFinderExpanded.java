package com.kodilla.exception.test;

import java.util.*;

public class FlightFinderExpanded {
    private Map<String, List<String>> flights;

    public FlightFinderExpanded(Map<String, List<String>> flights) {
        this.flights = flights;
    }

    final public boolean isFlightPossible(String from, String to) throws RouteNotFoundException {
        System.out.println(from + " -> " + to);
        if (flights.get(from) == null || flights.get(to) == null) {
            throw new RouteNotFoundException("The airport does not exist.");
        }
        if (flights.get(from) == flights.get(to)) {
            throw new RouteNotFoundException("Airplane can't flight to the same Town.");
        }
        if (flights.get(from).contains(to)) {
            System.out.println("You can fly to this town.");
            System.out.println();
            return true;
        }
        for (String airports : flights.get(to)) {
            if (isFlightPossible(airports, to)) {
                return true;
            }
        }
        return false;
    }
}