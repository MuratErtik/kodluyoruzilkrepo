package org.demo.oop.flightmanagement;

public class Flight {
    private String id;
    private Airport departureAirport;
    private Airport arrivalAirport;
    private Aircraft aircraft;
    private Pilot pilot;
    private Pilot coPilot;

    public Flight(String id, Airport dep, Airport arr, Aircraft ac, Pilot p, Pilot cp) {
        this.id = id;
        this.departureAirport = dep;
        this.arrivalAirport = arr;
        this.aircraft = ac;
        this.pilot = p;
        this.coPilot = cp;
    }
}
