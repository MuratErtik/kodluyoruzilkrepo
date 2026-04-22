package org.demo.java101;

import java.util.Scanner;

public class RecursivePower {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        int base = scanner.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int exponent = scanner.nextInt();

        System.out.println("Sonuç: " + power(base, exponent));

        scanner.close();
    }

    static int power(int base, int exponent) {
        // Base case: Any number to the power of 0 is 1
        if (exponent == 0) {
            return 1;
        }
        // Recursive step: base^exponent = base * base^(exponent - 1)
        else {
            return base * power(base, exponent - 1);
        }
    }
}
