package org.demo.java101;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variables for grades
        int math, physics, chemistry, turkish, history, music;

        // Get grades from user
        System.out.print("Enter your Math grade: ");
        math = scanner.nextInt();

        System.out.print("Enter your Physics grade: ");
        physics = scanner.nextInt();

        System.out.print("Enter your Chemistry grade: ");
        chemistry = scanner.nextInt();

        System.out.print("Enter your Turkish grade: ");
        turkish = scanner.nextInt();

        System.out.print("Enter your History grade: ");
        history = scanner.nextInt();

        System.out.print("Enter your Music grade: ");
        music = scanner.nextInt();

        double average = (math + physics + chemistry + turkish + history + music) / 6.0;

        System.out.println("Your Average: " + average);

        String result = (average > 60) ? "Passed the Class" : "Failed the Class";

        System.out.println(result);

        scanner.close();
    }
}