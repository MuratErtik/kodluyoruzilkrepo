package org.demo.oop.flightmanagement;

import java.util.ArrayList;
import java.util.List;

public class Airline {
    private String id;
    private String name;
    private List<Pilot> pilots;
    private List<Aircraft> aircrafts;

    public Airline(String id, String name) {
        this.id = id;
        this.name = name;
        this.pilots = new ArrayList<>();
        this.aircrafts = new ArrayList<>();
    }
    // Getter ve Setter'lar...
}
