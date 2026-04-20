package org.demo.java101;

import java.util.Scanner;

public class FlightTicketCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        int distance = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int age = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        int tripType = scanner.nextInt();

        if (distance > 0 && age > 0 && (tripType == 1 || tripType == 2)) {
            double normalPrice = distance * 0.10;
            double ageDiscount = 0;

            if (age < 12) {
                ageDiscount = normalPrice * 0.50;
            } else if (age <= 24) {
                ageDiscount = normalPrice * 0.10;
            } else if (age > 65) {
                ageDiscount = normalPrice * 0.30;
            }

            double discountedPrice = normalPrice - ageDiscount;

            if (tripType == 2) {
                double roundTripDiscount = discountedPrice * 0.20;
                discountedPrice = (discountedPrice - roundTripDiscount) * 2;
            }

            System.out.println("Toplam Tutar = " + discountedPrice + " TL");
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }

        scanner.close();
    }
}
