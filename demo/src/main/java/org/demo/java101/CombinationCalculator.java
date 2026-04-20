package org.demo.java101;

import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        int n = scanner.nextInt();

        System.out.print("r değerini giriniz: ");
        int r = scanner.nextInt();

        int nFactorial = 1;
        for (int i = 1; i <= n; i++) {
            nFactorial *= i;
        }

        int rFactorial = 1;
        for (int i = 1; i <= r; i++) {
            rFactorial *= i;
        }

        int nrFactorial = 1;
        for (int i = 1; i <= (n - r); i++) {
            nrFactorial *= i;
        }

        int combination = nFactorial / (rFactorial * nrFactorial);

        System.out.println("C(" + n + "," + r + ") = " + combination);

        scanner.close();
    }
}
