# Blog Notes: Insertion Sort

This method will sort an incoming array of integers, from least to highest.

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
  * So you have to think about to sort something.  Well, is 2 smaller than 3?  Yes.  So naturally, in a sorted list, 2 will come before 3.  So using this same concept, as you iterate through your array, you're constantly comparing two values to one another to see if one is bigger than the next and if it is, then do something with it.
  
* But how do we do that?
  * First step is to create a new method that takes in an int[] and returns an int[]
  ```
  public static int[] sortArray(int[] arr) {
  //
  }
  ```
  * Second step will be to compare two values.  Easiest way to go about this is two loops within one another.  One loop as a for loop, which grabs the current array's index and another loop that is a while loop, which will compare all the values against each other in the array until it fits in place.
      * This is the first for loop, which loops through the incoming array, sets a variable named `j` to `i - 1` and a `temp` variable to the array at [i]'s position.
  ```
  for (int i = 0; i < arr.length; i++) {
          int j = i - 1;
          int temp = arr[i];
  }
  ```
    * Inside of our while loop, after the `temp` variable, we create a while loop.  This loop is where the actual sorting takes place.
       
  ```
  while (j >= 0 && temp < arr[j]) {
              arr[j + 1] = arr[j];
              j = j - 1;
              arr[j + 1] = temp;
          }
  ```
  
## Algorithm

Describe in detail how the algorithm works.
Include small code snippets to possibly support the points

## Pseudocode

```
  InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp
```

## Readings and References

**Watch**

* [Video](https://www.youtube.com/watch?v=lCDZ0IprFw4)

**Read**

* [Article 1](https://study.com/academy/lesson/how-to-sort-an-array-in-java.html)

