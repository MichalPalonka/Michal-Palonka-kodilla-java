package com.kodilla.good.patterns.FlightFinder;


import java.util.List;

public class FlightFinderApp {
    public static void main(String[] args) {
        List<Airport> airports = new Airports().getAirports();
        FlightFinder flightFinder = new FlightFinder(airports);

        System.out.println(flightFinder.allFlyFrom(new Airport("warsaw")));
        System.out.println();
        System.out.println(flightFinder.allFlyTo(new Airport("warsaw")));
        System.out.println();
        System.out.println(flightFinder.allFlightsFromChange(new Flight(new Airport("warsaw"), new Airport("tokio"))));
    }
}
