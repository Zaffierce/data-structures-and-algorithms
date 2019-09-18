package code401challenges.ArrayReverse;

import java.util.Arrays;
//We were super close with our whiteboard but we ended up using this source below to figure out 
//what we were missing.
//https://www.geeksforgeeks.org/reverse-an-array-in-java/

public class ArrayReverse {

  //main method for running code
  public static void main(String[] args) {

    // int[] arrToReverse = new int[]{1,2,3,4,5,6,7};
    int[] arrToReverse = new int[]{89, 2354, 3546, 23, 10, -923, 823, -12};
    int[] reversedArray = reverseArray(arrToReverse);
    System.out.println(Arrays.toString(reversedArray));
  }

  public static int[] reverseArray(int[] arr) {

  int[] array2 = new int[arr.length];
  int currentNum = arr.length;

  for (int i = 0; i < arr.length; i++){
    //array2[length of array - 1] is equal to arr[i]
    array2[currentNum - 1] = arr[i];
    //then decrement currentNum
    currentNum = currentNum - 1;
  }
  return array2;
  }

}