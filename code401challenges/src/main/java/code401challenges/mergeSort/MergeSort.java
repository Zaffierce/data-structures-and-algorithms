package code401challenges.mergeSort;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] arr) {
        int n = arr.length;

        if (n > 1) {
            int mid = n / 2;
            int[] left = new int[mid - 1];
            int[] right = new int[mid + 1];
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

        while (i < left.length && i < right.length) {
            if (left[i] <= right[i]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        if (i == left.length) {
            arr[k] = right[j];
        } else {
            arr[k] = left[i];
        }
    }

    public static void main (String[] args) {
        int arr[] = {1,5,9,2,7,20};
        System.out.println(Arrays.toString(mergeSort(arr)));

    }
}
