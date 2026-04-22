package org.demo.oop.flightmanagement;

public class AircraftType {
    private String typeName;
    private int requiredPilots;

    public AircraftType(String typeName, int requiredPilots) {
        this.typeName = typeName;
        this.requiredPilots = requiredPilots;
    }
}
