package com.kodilla.exception.test;

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

        FlightFinderExpanded flightFinder = new FlightFinderExpanded();
        try { //Lot do lotniska do którego nie mozna dlecieć bez przesiadki
            flightFinder.findFlight(new Flight("Warsaw", "Sydney"));
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
            flightFinder.findFlight(new Flight("Warsaw", "Dubai"));
        } catch (RouteNotFoundException e) {
            System.out.println("Can't find flight. \nError code: " + e);
            System.out.println();
        }
    }
}