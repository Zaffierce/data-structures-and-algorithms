//package code401challenges;
//
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class BinarySearchTest {
//
//    @Test
//    public void testBinarySearch() {
//        int arr[] = new int[]{4,8,15,16,23,42};
//        assertEquals(
//                "This should return 3, which is the index position of your search key",
//                3,
//                code401challenges.BinarySearch.BinarySearch(arr, 16)
//        );
//    }
//
//    @Test
//    public void testBinarySearch_empty() {
//        int arr[] = new int[]{};
//        assertEquals(
//                "This should return -1, as this is an empty array and the number does not exist.",
//                -1,
//                code401challenges.BinarySearch.BinarySearch(arr, 16)
//        );
//    }
//}