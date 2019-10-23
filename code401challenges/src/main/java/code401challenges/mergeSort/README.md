# Blog Notes: Insertion Sort

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
  * To do
  
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

* [Video](https://www.youtube.com/watch?v=wObxd4Kx8sE)

**Read**

* [Article 1](https://study.com/academy/lesson/how-to-sort-an-array-in-java.html)

