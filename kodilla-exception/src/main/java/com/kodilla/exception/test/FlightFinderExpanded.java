package com.kodilla.exception.test;

import java.util.*;
import java.util.stream.Collectors;


public class FlightFinderExpanded {
    Map<String, List<String>> whereYouCanFlyTo = new HashMap<String, List<String>>();
    List<String> warsaw = new ArrayList<>();
    List<String> beijing = new ArrayList<>();
    List<String> dubai = new ArrayList<>();
    List<String> berlin = new ArrayList<>();
    {
        //Warsaw
        warsaw.add("Beijing");
        warsaw.add("Dubai");
        warsaw.add("Berlin");
        whereYouCanFlyTo.put("Warsaw", warsaw);
        //Beijing
        beijing.add("Warsaw");
        beijing.add("Dubai");
        beijing.add("Wroclaw");
        whereYouCanFlyTo.put("Beijing", beijing);
        //Dubai
        dubai.add("Warsaw");
        dubai.add("Beijing");
        dubai.add("Cracow");
        whereYouCanFlyTo.put("Dubai", dubai);
        //Berlin
        berlin.add("Warsaw");
        berlin.add("New York");
        berlin.add("Sydney");
        whereYouCanFlyTo.put("Berlin", berlin);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        List<String> flyWithChange = whereYouCanFlyTo.entrySet().stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        if (whereYouCanFlyTo.containsKey(flight.getDepartureAirport()) && whereYouCanFlyTo.get(flight.getDepartureAirport()).contains(flight.getArrivalAirport())) {
            if(flight.getArrivalAirport() == flight.getDepartureAirport()){
                throw new RouteNotFoundException("Airplane can't flight to the same Town.");
            } else {
                System.out.println("Your flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " exsist.");
            }
        } else {
            if(flyWithChange.contains(flight.getArrivalAirport())){
                System.out.println("Your flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " exsist only with change.");
            }else{
                throw new RouteNotFoundException("The airport does not exist.");
            }
        }
    }
}