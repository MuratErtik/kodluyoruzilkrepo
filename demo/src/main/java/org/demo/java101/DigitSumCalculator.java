package org.demo.java101;

import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int number = input.nextInt();

        int tempNumber = number;
        int sum = 0;
        int basValue;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            sum += basValue;
            tempNumber /= 10;
        }

        System.out.println(number + " sayısının basamakları toplamı: " + sum);

        input.close();
    }
}
