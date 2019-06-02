package com.kodilla.exception.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightFinderRunner {

    public static void main(String[] args) {
        /*FlightFinder flightFinder = new FlightFinder();

        try { //Lot do tego samego lotniska
            flightFinder.findFlight(new Flight("Warsaw", "Warsaw"));
        } catch (RouteNotFoundException e) {
            System.out.println("Can't find flight. \nError code: " + e);
            System.out.println();
        }
        try { //Lot do lotniska do którego nie mozna wylądować (wartość w mapie false)
            flightFinder.findFlight(new Flight("Warsaw", "Wroclaw"));
        } catch (RouteNotFoundException e) {
            System.out.println("Can't find flight. \nError code: " + e);
            System.out.println();
        }
        try { //Lot do lotniska którego nie ma w mapie
            flightFinder.findFlight(new Flight("Warsaw", "Wroclove"));
        } catch (RouteNotFoundException e) {
            System.out.println("Can't find flight. \nError code: " + e);
            System.out.println();
        }
        try { //Lot który się powiedzie
            flightFinder.findFlight(new Flight("Warsaw", "Cracow"));
        } catch (RouteNotFoundException e) {
            System.out.println("Can't find flight. \nError code: " + e);
            System.out.println();
        }
    }*/

        final Map<String, List<String>> map = new HashMap<>();
        map.put("Warsaw", Arrays.asList("Cracow", "Wroclaw"));
        map.put("Cracow", Arrays.asList("Warsaw", "Wroclaw"));
        map.put("Wroclaw", Arrays.asList("Warsaw", "Cracow", "Poznan"));
        map.put("Poznan", Arrays.asList("Wroclaw"));

        FlightFinderExpanded flightFinder = new FlightFinderExpanded(map);
        try {
            flightFinder.isFlightPossible("Warsaw", "Cracow");
        } catch (RouteNotFoundException e) {
            System.out.println("Can't find flight. \nError code: " + e);
            System.out.println();
        }

        try {
            flightFinder.isFlightPossible("Warsaww", "Cracow");
        } catch (RouteNotFoundException e) {
            System.out.println("Can't find flight. \nError code: " + e);
            System.out.println();
        }

        try {
            flightFinder.isFlightPossible("Warsaw", "Warsaw");
        } catch (RouteNotFoundException e) {
            System.out.println("Can't find flight. \nError code: " + e);
            System.out.println();
        }

        try {
            flightFinder.isFlightPossible("Warsaw", "Poznan");
        } catch (RouteNotFoundException e) {
            System.out.println("Can't find flight. \nError code: " + e);
            System.out.println();
        }

    }
}