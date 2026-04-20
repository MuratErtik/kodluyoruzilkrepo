package org.demo.java101;

import java.util.Scanner;

public class HoroscopeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter your birth day: ");
        int day = scanner.nextInt();

        String horoscope = "";

        if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
            horoscope = "Aries";
        } else if ((month == 4 && day >= 21) || (month == 5 && day <= 21)) {
            horoscope = "Taurus";
        } else if ((month == 5 && day >= 22) || (month == 6 && day <= 22)) {
            horoscope = "Gemini";
        } else if ((month == 6 && day >= 23) || (month == 7 && day <= 22)) {
            horoscope = "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            horoscope = "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            horoscope = "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            horoscope = "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            horoscope = "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            horoscope = "Sagittarius";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 21)) {
            horoscope = "Capricorn";
        } else if ((month == 1 && day >= 22) || (month == 2 && day <= 19)) {
            horoscope = "Aquarius";
        } else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)) {
            horoscope = "Pisces";
        } else {
            System.out.println("Invalid date entered.");
            return;
        }

        System.out.println("Your horoscope is: " + horoscope);
        scanner.close();
    }
}
