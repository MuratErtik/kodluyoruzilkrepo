package org.demo.java101;

import java.util.Scanner;

public class EvenAndMultipleOfFourSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;

        do {
            System.out.print("Bir sayı giriniz: ");
            number = scanner.nextInt();


            if (number % 2 == 0 && number % 4 == 0) {
                sum += number;
            }

        } while (number % 2 == 0);

        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı: " + sum);

        scanner.close();
    }
}
