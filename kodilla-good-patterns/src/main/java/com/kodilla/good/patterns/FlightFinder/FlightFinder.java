package com.kodilla.good.patterns.FlightFinder;

import java.util.ArrayList;
import java.util.List;

class FlightFinder {

    private List<Airport> airports;

    public FlightFinder(List<Airport> airports) {
        this.airports = airports;
    }

    public List<Airport> allFlyFrom(Airport airport) {
        for (Airport airports : airports) {
            if (airports.getName().equals(airport.getName())) {
                return airports.getPossibleFlight();
            }
        }
        return null;
    }

    public List<Airport> allFlyTo(Airport airport) {
        final List<Airport> possibleFlight = new ArrayList<>();
        for (Airport airports : airports) {
            airports.getPossibleFlight().stream()
                    .filter(entry -> entry.getName().equals(airport.getName()))
                    .forEach(entry -> possibleFlight.add(airports));
        }
        return possibleFlight;
    }

    public List<Airport> allFlightsFromChange(Flight flight) {
        final List<Airport> possibleFlight = new ArrayList<>();

        for(Airport airport : airports) {
            airport.getPossibleFlight().stream()
                    .filter(entry -> entry.getPossibleFlight().contains(flight.getArrivalAirport()))
                    .filter(entry -> !entry.getName().equals(flight.getDepartureAirport().getName()))
                    .filter(entry -> !entry.getName().equals(flight.getArrivalAirport().getName()))
                    .forEach(entry -> possibleFlight.add(airport));
        }
        return new ArrayList<>(possibleFlight);
    }
}
