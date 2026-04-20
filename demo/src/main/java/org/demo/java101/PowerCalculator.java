package org.demo.java101;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int n = scanner.nextInt();

        System.out.println("4'ün kuvvetleri:");
        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }

        System.out.println("5'in kuvvetleri:");
        for (int i = 1; i <= n; i *= 5) {
            System.out.println(i);
        }

        scanner.close();
    }
}