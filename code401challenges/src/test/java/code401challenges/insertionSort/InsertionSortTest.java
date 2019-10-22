package code401challenges.insertionSort;

import org.junit.Test;

import java.util.Arrays;
import static org.junit.Assert.*;

public class InsertionSortTest {

    InsertionSort sortMyArr = new InsertionSort();

    @Test
    public void insertionSort() {
        int[] answer = new int[]{1,2,3,4,5};
        int[] testArr = new int[]{5,2,1,4,3};
        assertArrayEquals("This should return our array in sorted order.",
                answer,
                sortMyArr.insertionSort(testArr));
    }

    @Test
    public void insertionSortOne() {
        int[] answer = new int[]{1};
        int[] testArr = new int[]{1};
        assertArrayEquals("This should only return one value",
                answer,
                sortMyArr.insertionSort(testArr));
    }

    //How to test for throwing errors.
    //https://stackoverflow.com/questions/156503/how-do-you-assert-that-a-certain-exception-is-thrown-in-junit-4-tests
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void insertionSortEmpty() {
        int[] testArr = new int[]{};
        assertEquals("This should throw an ArrayIndexOutOfBoundsException",
                sortMyArr.insertionSort(testArr));

//        sortMyArr.insertionSort(testArr);
    }
}