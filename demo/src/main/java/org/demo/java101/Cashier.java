package org.demo.java101;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pearPrice = 2.14;
        double applePrice = 3.67;
        double tomatoPrice = 1.11;
        double bananaPrice = 0.95;
        double eggplantPrice = 5.00;

        System.out.print("Armut Kaç Kilo ? :");
        double pearKg = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        double appleKg = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        double tomatoKg = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        double bananaKg = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        double eggplantKg = scanner.nextDouble();

        double total = (pearKg * pearPrice) + (appleKg * applePrice) +
                (tomatoKg * tomatoPrice) + (bananaKg * bananaPrice) +
                (eggplantKg * eggplantPrice);

        System.out.println("Toplam Tutar : " + total + " TL");

        scanner.close();
    }
}
