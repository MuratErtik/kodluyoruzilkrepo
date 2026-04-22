package org.demo.java101;

import java.util.Scanner;
import java.util.Arrays;

public class ArraySorter {

    public void sortArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        int n = scanner.nextInt();
        int[] list = new int[n];

        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            list[i] = scanner.nextInt();
        }

        Arrays.sort(list);

        System.out.print("Sıralama : ");
        for (int i : list) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
