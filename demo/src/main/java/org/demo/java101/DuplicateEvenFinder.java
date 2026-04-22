package org.demo.java101;



public class DuplicateEvenFinder {

    public void findDuplicateEvens(int[] arr) {
        int[] duplicate = new int[arr.length];
        int startIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j]) && (arr[i] % 2 == 0)) {
                    if (!isFind(duplicate, arr[i])) {
                        duplicate[startIndex++] = arr[i];
                    }
                    break;
                }
            }
        }

        System.out.println("Dizideki Tekrar Eden Çift Sayılar:");
        for (int value : duplicate) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }
    }

    private boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}
