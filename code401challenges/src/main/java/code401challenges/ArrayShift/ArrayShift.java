package code401challenges.ArrayShift;
import java.util.Arrays;

public class ArrayShift {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertShiftArray(new int[] {2,4,6,8}, 10)));
    }

    //method goes here
    public static int[] insertShiftArray(int[] input, int numberToAdd) {
        int mid = input.length / 2;
        int[] newArray = new int[input.length + 1];
        int j = 0;

        for (int i = 0; i < newArray.length; i++) {
            if (i == mid) {
                newArray[i] = numberToAdd;
            } else {
                newArray[i] = input[j];
                j++;
            }
        }
        return newArray;
    }
}
