package org.demo.java101;

import java.util.Arrays;

public class FrequencyCounter {

    public void countFrequencies(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }

            System.out.println(arr[i] + " sayısı " + count + " kere tekrar edildi.");
        }
    }
}