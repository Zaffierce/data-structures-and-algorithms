# Blog Notes: Merge Sort

This method will take in an array of numbers and sort it using recursion.

## Learning Objectives
* Understanding the problem domain
* Stepping through the logic
* Writing the code
* Stepping through the code
* Writing tests

## Information Flow

* Understanding the problem domain
  * In this code challenge, the objective is to take in an array of integers and sort them from lowest to highest.
    
* Stepping through the logic
  * So you have to think about how to sort things using recursion.  Thinking about how recursion works on it's own seems like simple magic, and now add on the complexity of sorting.  Basically, you're going to break down the array until it's as small as a single number, then return that.  Repeat process until array is completely stripped down, then sort the left, sort the right, then sort when you combine them.  Again, it's a lot of recursion magic.
  
* But how do we do that?
  * First, declare your method...
  ```
  public static int[] mergeSort(int[] arr) {
  //Write everything else 
  }
  ```
  * Now we need to get the length of our array, and get the middle.  In addition to this, we perform validation that if our array's length is less than 2, we just return the array.
  ```
  int n = arr.length;
  
          if (n < 2) {
              return arr;
          } else {
              int mid = n / 2;
  ```
  * Next step is to take that array, divide it on the middle, and put that into two arrays.
    * We also use a new thing called `Arrays.copyOfRange` which takes 3 parameters and a new function as well called `merge`.
  ```
              int[] left = Arrays.copyOfRange(arr, 0, mid);
              int[] right = Arrays.copyOfRange(arr, mid, n);
              mergeSort(left);
              mergeSort(right);
              merge(left, right, arr);
          }
          return arr;
      }
  ```
  * On to the `merge` method, we can see that we take in a left, right and arr so we'll define that as so.
    * We also define 3 integers which will act as counters.
  ```
  public static void merge(int[] left, int[] right, int[] arr) {
          int i = 0;
          int j = 0;
          int k = 0;
  ```
  * Now do a while loop
    * This validates and sorts our arrays using the above integers.
  ```
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
  ```
  * And now the last bit of this basically just increments our counters and keeps things in order.
  ```
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
  ```
## Pseudocode

```
  
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left

```

## Readings and References

**Watch**

* [Video](https://www.youtube.com/watch?v=JSceec-wEyw)

**Read**

* [Article 1](https://www.geeksforgeeks.org/merge-sort/)

