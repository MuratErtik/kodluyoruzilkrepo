package org.demo.java101;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int n = scanner.nextInt();

        recursivePattern(n, n, true);
    }

    static void recursivePattern(int originalN, int currentN, boolean subtract) {
        System.out.print(currentN + " ");

        if (subtract) {
            if (currentN > 0) {
                recursivePattern(originalN, currentN - 5, true);
            } else {
                recursivePattern(originalN, currentN + 5, false);
            }
        } else {
            if (currentN != originalN) {
                recursivePattern(originalN, currentN + 5, false);
            }
        }
    }
}
