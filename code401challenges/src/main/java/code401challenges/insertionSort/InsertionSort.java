package code401challenges.insertionSort;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] arr) {
        if (arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Cannot sort an empty array");
        }

    for (int i = 0; i < arr.length; i++) {
        int j = i - 1;
        int temp = arr[i];

        while (j >= 0 && temp < arr[j]) {
            arr[j + 1] = arr[j];
            j = j - 1;
            arr[j + 1] = temp;
        }
    }
        return arr;
    }

}
