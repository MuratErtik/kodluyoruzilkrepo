package org.demo.oop.onlinefilmplatform;

public class Movie {
    public String title;
    public double rentalPrice;
    public boolean isAvailable;

    public void requestMovie() { }

    public int getRentalPrice() {
        return (int) rentalPrice;
    }
}
