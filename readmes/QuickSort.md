## January 23rd, 2019: Quick Sort

[code](../src/main/java/quicksort/QuickSort.java)
[test](../src/test/java/quicksort/QuickSortTest.java)

### Challenge:

Implement a quicksort method. This method should rotate the array around a pivot point, then rotate everything below and above that around another pivot point until it reaches previously sorted arrays and returns outward with a sorted array.

### Approach and Efficiency:

The method I implemented is modeled after the pseudo code I found while reading the wikipedia page on quicksort and how it works. The code first moves the array values around a pivot point which is the last index. It then recursively calls itself on the lower "partition" of the array and the higher "partition" until it reaches a point where the recursive call is for a single index at which point the array is sorted and it returns outward.

Because of how this implementation of quicksort handles the pivot point if an array is already sorted this will have a Big O for time of O(n<sup>2</sup>). However this is an in place method which uses O(1) space.

### Documentation used in researching quick sort:

[Quick Sort Wikipedia Page](https://en.wikipedia.org/wiki/Quicksort)