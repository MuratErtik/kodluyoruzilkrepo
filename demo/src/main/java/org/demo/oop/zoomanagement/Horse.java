package org.demo.oop.zoomanagement;

public class Horse extends Animal {
    public double getDosage() { return weight * 0.5; }
    public String getFeedSchedule() { return "Günde 3 kez, ot odaklı."; }
}
