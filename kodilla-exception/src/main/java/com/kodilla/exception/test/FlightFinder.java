package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    private final Map<String, Boolean> airports;

    public FlightFinder() {
        airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("Cracow", true);
        airports.put("Wroclaw", false);
        airports.put("Poznan", false);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        if (airports.containsKey(flight.getArrivalAirport()) && airports.containsKey(flight.getDepartureAirport())) {
            if(flight.getArrivalAirport() == flight.getDepartureAirport()){
                throw new RouteNotFoundException("Airplane can't flight to the same Town.");
            }
            if(Boolean.TRUE.equals(airports.get(flight.getArrivalAirport()))) {
                System.out.println("Your flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " exsist.");
            }else{
                throw new RouteNotFoundException("Air plane can't land is this town.");
            }
        } else {
            throw new RouteNotFoundException("The airport does not exist.");
        }
    }
}