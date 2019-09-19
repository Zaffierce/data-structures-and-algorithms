package code401challenges;

public class BinarySearch {
//    public static void main(String[] args){
//        int arr[] = new int[]{4,8,15,16,23,42};
//        System.out.println(BinarySearch(arr, 15));
//    }

    public static int BinarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
