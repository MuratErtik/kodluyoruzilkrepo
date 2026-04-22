package org.demo.java101;

import java.util.Arrays;

public class NearestNumberFinder {

    public void findNearestNumbers(int[] arr, int target) {
        Arrays.sort(arr);

        int smallerNearest = arr[0];
        int largerNearest = arr[arr.length - 1];

        for (int i : arr) {
            if (i < target) {
                smallerNearest = i;
            }
            if (i > target && largerNearest == arr[arr.length - 1]) {
                largerNearest = i;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + smallerNearest);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + largerNearest);
    }
}
