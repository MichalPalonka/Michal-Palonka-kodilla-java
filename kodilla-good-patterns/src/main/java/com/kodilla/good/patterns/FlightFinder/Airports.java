package com.kodilla.good.patterns.FlightFinder;

import java.util.*;

public class Airports {
    private ArrayList<Airport> airports = new ArrayList<>();

    public Airports(){
        Airport warsaw = new Airport("warsaw");
        Airport cracow = new Airport("cracow");
        Airport wroclaw = new Airport("wroclaw");
        Airport poznan = new Airport("poznan");
        Airport tokio = new Airport("tokio");
        Airport nyc = new Airport("new york");

        warsaw.addPossibleFlight(cracow);
        warsaw.addPossibleFlight(wroclaw);
        warsaw.addPossibleFlight(poznan);
        warsaw.addPossibleFlight(tokio);
        warsaw.addPossibleFlight(nyc);

        cracow.addPossibleFlight(warsaw);
        wroclaw.addPossibleFlight(warsaw);
        poznan.addPossibleFlight(warsaw);
        tokio.addPossibleFlight(warsaw);

        cracow.addPossibleFlight(tokio);
        wroclaw.addPossibleFlight(tokio);
        poznan.addPossibleFlight(tokio);
        nyc.addPossibleFlight(tokio);


        airports.add(warsaw);
        airports.add(cracow);
        airports.add(poznan);
        airports.add(tokio);
        airports.add(wroclaw);
        airports.add(nyc);
    }

    public ArrayList<Airport> getAirports() {
        return airports;
    }
}

