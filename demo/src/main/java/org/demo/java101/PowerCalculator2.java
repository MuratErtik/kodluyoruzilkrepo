package org.demo.java101;

import java.util.Scanner;

public class PowerCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değerini giriniz: ");
        int base = scanner.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int exponent = scanner.nextInt();

        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç: " + result);

        scanner.close();
    }
}
