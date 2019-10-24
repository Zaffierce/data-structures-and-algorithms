package code401challenges.quickSort;

public class QuickSort {

    public static void QuickSort(int[] arr, int left, int right){
        if (left < right) {
            int position = Partition(arr, left, right);
            QuickSort(arr, left, position - 1);
            QuickSort(arr, position + 1, right);
        }
    }

    public static int Partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int low = left - 1;
        for (int i = left; i < right; i++) {
            if (arr[i] <= pivot) {
                low++;
                Swap(arr, i, low);
            }
        }
        Swap(arr, right, low + 1);
        return low+1;
    }

    public static void Swap(int arr[], int i, int low) {
        int temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main (String[] args) {
        int arr[] = new int[]{1,6,9,2,10,5,12};
        int n = arr.length;
        QuickSort(arr, 0, n-1);
        printArray(arr);
    }
}
