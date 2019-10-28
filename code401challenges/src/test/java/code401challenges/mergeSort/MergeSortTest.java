package code401challenges.MergeSort;

import org.junit.Test;

import java.util.Arrays;

public class MergeSortTest {

//    MergeSort mergeSort = new MergeSort();

    @Test
    public void sortArray() {
        int arr[] = {1,5,9,2,7,20,-3};
        System.out.println(Arrays.toString(MergeSort.mergeSort(arr)));
        //WHY ARE YOU ANGRY AT LIFE.

    }

    @Test
    public void merge() {
    }
}