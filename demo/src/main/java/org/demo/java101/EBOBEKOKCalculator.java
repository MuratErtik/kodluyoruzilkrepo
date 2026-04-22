package org.demo.java101;

import java.util.Scanner;

public class EBOBEKOKCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        int n1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int n2 = scanner.nextInt();

        int ebob = 1;
        int i = (n1 < n2) ? n1 : n2;

        while (i >= 1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                break;
            }
            i--;
        }

        int ekok = (n1 * n2) / ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);

        scanner.close();
    }
}
