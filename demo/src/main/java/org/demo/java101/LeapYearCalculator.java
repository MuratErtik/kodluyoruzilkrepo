package org.demo.java101;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        int year = scanner.nextInt();

        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }

        if (isLeapYear) {
            System.out.println(year + " bir artık yıldır !");
        } else {
            System.out.println(year + " bir artık yıldır değildir !");
        }

        scanner.close();
    }
}
