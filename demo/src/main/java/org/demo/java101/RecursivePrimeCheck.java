package org.demo.java101;

import java.util.Scanner;

public class RecursivePrimeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int number = scanner.nextInt();

        if (isPrime(number, 2)) {
            System.out.println(number + " sayısı ASALDIR !");
        } else {
            System.out.println(number + " sayısı ASAL değildir !");
        }

        scanner.close();
    }

    static boolean isPrime(int n, int divisor) {
        if (n < 2) {
            return false;
        }
        if (divisor > n / 2) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return isPrime(n, divisor + 1);
    }
}
