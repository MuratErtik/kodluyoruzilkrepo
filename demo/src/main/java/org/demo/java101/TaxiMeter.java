package org.demo.java101;

import java.util.Scanner;

public class TaxiMeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double OPENING_FEE = 10.0;
        final double PRICE_PER_KM = 2.20;
        final double MINIMUM_FEE = 20.0;

        System.out.print("Enter the distance traveled in KM: ");
        double km = scanner.nextDouble();

        double total = OPENING_FEE + (km * PRICE_PER_KM);

        total = (total < MINIMUM_FEE) ? MINIMUM_FEE : total;

        System.out.println("Total Taxi Fare: " + total + " TL");

        scanner.close();
    }
}
