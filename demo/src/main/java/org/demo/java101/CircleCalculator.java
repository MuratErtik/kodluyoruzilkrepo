package org.demo.java101;

import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14;

        System.out.println("--- Circle Area and Circumference ---");
        System.out.print("Enter the radius (r) of the circle: ");
        double r = scanner.nextDouble();

        double area = PI * r * r;
        double circumference = 2 * PI * r;

        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);


        System.out.println("--- Circular Sector Area Calculator ---");
        System.out.print("Enter the radius (r): ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the central angle (alpha): ");
        double alpha = scanner.nextDouble();

        double sectorArea = (PI * (radius * radius) * alpha) / 360;

        System.out.println("Area of the circular sector: " + sectorArea);

        scanner.close();
    }
}
