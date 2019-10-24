# Blog Notes: Quick Sort

This method will take in an array of numbers and sort it using recursion and splitting the array in half given a middle point.  It will then sort the left array, then right array, then combine the left, middle point that you split on, and right together to make a sorted array.  This method is up for debate when it comes to efficiency, depending on where you split your array at depends on how efficient it is.  It could be fantastic, or it could be the absolute worst.

## Learning Objectives
* Understanding the problem domain
* Stepping through the logic
* Writing the code
* Stepping through the code
* Writing tests

## Information Flow

* Understanding the problem domain
  * In this code challenge, the objective is to take in an array of integers and sort them from lowest to highest using recursion and splitting them into two arrays.
    
* Stepping through the logic
  * Given the statement above, this may seem very vague and hard to understand.  But don't worry, we'll get you there!  Take an array and split it on a position that you give it, then sort the left half of that array, then the right half of that array.  Now take all 3 parts and put them back into a beautiful sorted array.  
  
* But how do we do that?
  * To do that, you must first create a method called `QuickSort`.  This method takes in your array, the left position (we'll use 0) and the right position
  ```
  public static void QuickSort(int[] arr, int left, int right) {
  //Do something...
  }
  ```
  * Now we throw in the sauce for that method, which basically says if left is less than right, recursively run this.  But you may also notice there's now a `Partition` method.  This new method is where the sorting takes place.
  ```
  if (left < right) {
              int position = Partition(arr, left, right);
              QuickSort(arr, left, position - 1);
              QuickSort(arr, position + 1, right);
          }
  ```
  * So onto this new method, first define this...
  ```
  public static int Partition(int[] arr, int low, int right){
  //Do the sorting!
  }
  ```
  * Now we create some important steps, this step is probably the critical part of this entire algorithm in terms of time complexity.
    * This `pivot` is the position in where your array splits, which is equivalent to the `int right` that you pass into your QuickSort parameter.  Sorting this on the first or last position in your array will increase the time it takes to sort, vice sorting this from a middle-ish point.  Totally up to you how you want to do it, but just keep that in mind.
  ```
  int pivot = arr[right];
  ```
  * Next we fill in some more parts
    * You may notice another method here as well.  You don't necessarily have to do another method, but it is a helper method so we'll write it as such.
  ```
        int low = left - 1;
        for (int i = left; i < right; i++) {
            if (arr[i] <= pivot) {
                low++;
                Swap(arr, i, low);
            }
        }
        Swap(arr, right, low + 1);
        return low+1;
  ```
  * Now tie in the Swap method
  ```
  public static void Swap(int arr[], int i, int low) {
          int temp = arr[i];
          arr[i] = arr[low];
          arr[low] = temp;
      }
  ```
  
  
  
## Pseudocode

```
ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value 
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right. 
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp

```



## Readings and References

**Watch**

* [Video](https://www.youtube.com/watch?v=wObxd4Kx8sE)

**Read**

* [Article 1](https://study.com/academy/lesson/how-to-sort-an-array-in-java.html)

