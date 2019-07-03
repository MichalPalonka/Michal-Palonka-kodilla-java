package com.kodilla.good.patterns.FlightFinder;


public class FlightFinderApp {
    public static void main(String[] args) {
        FlightRetriever flightRetriever = new FlightRetriever();
        Flight flight = flightRetriever.getFlight();

        FlightFinder flightFinder = new FlightFinder(flight);
        System.out.println(flightFinder.allFlyFrom());
        System.out.println();
        System.out.println(flightFinder.allFlyTo());
        System.out.println();
        System.out.println(flightFinder.allFlightsFromChange());
    }
}
