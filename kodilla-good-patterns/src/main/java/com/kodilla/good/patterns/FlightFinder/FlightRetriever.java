package com.kodilla.good.patterns.FlightFinder;

public class FlightRetriever {
    public Flight getFlight() {
        return new Flight(new Airport("warsaw"), new Airport("tokio"));
    }
}
