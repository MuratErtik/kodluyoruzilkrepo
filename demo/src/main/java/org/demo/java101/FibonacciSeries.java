package org.demo.java101;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eleman sayısını giriniz: ");
        int n = scanner.nextInt();

        int n1 = 0;
        int n2 = 1;
        int nextTerm;

        System.out.print(n + " Elemanlı Fibonacci Serisi: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(n1 + " ");

            nextTerm = n1 + n2;
            n1 = n2;
            n2 = nextTerm;
        }

        scanner.close();
    }
}