package org.demo.java101;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your height (in meters): ");
        double height = scanner.nextDouble();

        System.out.print("Please enter your weight (in kilograms): ");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Your Body Mass Index: " + bmi);

        scanner.close();
    }
}
