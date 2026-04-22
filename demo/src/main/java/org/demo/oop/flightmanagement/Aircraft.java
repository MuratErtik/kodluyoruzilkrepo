package org.demo.oop.flightmanagement;

public class Aircraft {
    private String id;
    private String status;
    private AircraftType type;

    public Aircraft(String id, AircraftType type) {
        this.id = id;
        this.type = type;
        this.status = "ACTIVE";
    }
}
