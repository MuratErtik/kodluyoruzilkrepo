package org.demo.java101;

import java.util.Scanner;

public class TriangleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Hypotenuse Calculator ---");
        System.out.print("Enter the first leg length: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second leg length: ");
        double b = scanner.nextDouble();

        double hypotenuse = Math.sqrt((a * a) + (b * b));
        System.out.println("Hypotenuse: " + hypotenuse);


        System.out.println("--- Area Calculator (Heron's Formula) ---");
        System.out.print("Enter side a: ");
        double sideA = scanner.nextDouble();
        System.out.print("Enter side b: ");
        double sideB = scanner.nextDouble();
        System.out.print("Enter side c: ");
        double sideC = scanner.nextDouble();

        double u = (sideA + sideB + sideC) / 2;

        double area = Math.sqrt(u * (u - sideA) * (u - sideB) * (u - sideC));

        System.out.println("Perimeter of the triangle: " + (2 * u));
        System.out.println("Area of the triangle: " + area);

        scanner.close();
    }
}
