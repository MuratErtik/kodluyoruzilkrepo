package org.demo.java101;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        int number = scanner.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 0; i <= number; i++) {
            // Bir sayının hem 3'e hem de 4'e tam bölünmesi, 12'ye tam bölünmesi demektir
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("3 ve 4'e bölünen sayıların ortalaması: " + average);
        } else {
            System.out.println("3 ve 4'e bölünen bir sayı bulunamadı.");
        }

        scanner.close();
    }
}