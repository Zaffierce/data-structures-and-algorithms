package code401challenges.MergeSort;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] arr) {
        int n = arr.length;

        if (n < 2) {
            return arr;
        } else {
            int mid = n / 2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, n);
            mergeSort(left);
            mergeSort(right);
            merge(left, right, arr);
        }
        return arr;
    }

    public static void merge(int[] left, int[] right, int[] arr) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
    }
}
