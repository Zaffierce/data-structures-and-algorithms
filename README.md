# 401 Code Challenges

# Reverse an Array
Take in an array and reverse the data.

## Challenge
Take in an array of integers, that has no set length, and reverse the array.
inputArray: [1,2,3,4,5,6]
outputArray: [6,5,4,3,2,1]

## Approach & Efficiency
The approach was to set an integer based off of the inputArray.length and then decrement that value during a for loop.  Inside of this loop we would take the outputArray[inputArray.length - 1] and set that to inputArray[i].  This would do inputArray[6] = outputArray[6] ... inputArray[5] = outputArray[6,5] ... so on so fourth until the inputArray length is at 0.

## Solution
![](/assets/ArrayReverse.JPG)

