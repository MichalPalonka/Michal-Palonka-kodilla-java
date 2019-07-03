package com.kodilla.good.patterns.FlightFinder;

import java.util.ArrayList;
import java.util.List;

class FlightFinder {
    private Flight flight;
    private List<Airport> airports = new Airports().getAirports();


    public FlightFinder(Flight flight) {
        this.flight = flight;
    }

    public List<Airport> allFlyFrom() {
        for (Airport airport : airports) {
            if (airport.getName().equals(flight.getDepartureAirport().getName())) {
                return airport.getPossibleFlight();
            }
        }
        return null;
    }

    public List<Airport> allFlyTo() {
        final List<Airport> possibleFlight = new ArrayList<>();
        for (Airport airport : airports) {
            airport.getPossibleFlight().stream()
                    .filter(entry -> entry.getName().equals(flight.getDepartureAirport().getName()))
                    .forEach(entry -> possibleFlight.add(airport));
        }
        return possibleFlight;
    }

    public List<Airport> allFlightsFromChange() {
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
