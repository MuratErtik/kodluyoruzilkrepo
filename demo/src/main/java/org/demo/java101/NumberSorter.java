package org.demo.java101;

import java.util.Scanner;

public class NumberSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        System.out.print("Enter third number (c): ");
        int c = scanner.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("Order: " + a + " < " + b + " < " + c);
            } else {
                System.out.println("Order: " + a + " < " + c + " < " + b);
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("Order: " + b + " < " + a + " < " + c);
            } else {
                System.out.println("Order: " + b + " < " + c + " < " + a);
            }
        } else {
            if (a < b) {
                System.out.println("Order: " + c + " < " + a + " < " + b);
            } else {
                System.out.println("Order: " + c + " < " + b + " < " + a);
            }
        }

        scanner.close();
    }
}
