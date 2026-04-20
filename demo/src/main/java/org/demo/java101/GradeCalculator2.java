package org.demo.java101;

import java.util.Scanner;

public class GradeCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int math, physics, turkish, chemistry, music;
        int totalScore = 0;
        int validSubjectCount = 0;

        System.out.print("Math grade: ");
        math = scanner.nextInt();
        if (math >= 0 && math <= 100) {
            totalScore += math;
            validSubjectCount++;
        }

        System.out.print("Physics grade: ");
        physics = scanner.nextInt();
        if (physics >= 0 && physics <= 100) {
            totalScore += physics;
            validSubjectCount++;
        }

        System.out.print("Turkish grade: ");
        turkish = scanner.nextInt();
        if (turkish >= 0 && turkish <= 100) {
            totalScore += turkish;
            validSubjectCount++;
        }

        System.out.print("Chemistry grade: ");
        chemistry = scanner.nextInt();
        if (chemistry >= 0 && chemistry <= 100) {
            totalScore += chemistry;
            validSubjectCount++;
        }

        System.out.print("Music grade: ");
        music = scanner.nextInt();
        if (music >= 0 && music <= 100) {
            totalScore += music;
            validSubjectCount++;
        }

        if (validSubjectCount > 0) {
            double average = (double) totalScore / validSubjectCount;
            System.out.println("Average: " + average);

            if (average >= 55) {
                System.out.println("You passed the class.");
            } else {
                System.out.println("You failed the class.");
            }
        } else {
            System.out.println("No valid grades were entered for the average calculation.");
        }

        scanner.close();
    }
}