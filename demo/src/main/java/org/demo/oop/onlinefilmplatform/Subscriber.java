package org.demo.oop.onlinefilmplatform;

public class Subscriber extends User {
    private int credits;

    public void rentMovie(Movie movie) {
        if (movie.isAvailable && this.credits >= movie.getRentalPrice()) {
            this.credits -= movie.getRentalPrice();
        }
    }
}
