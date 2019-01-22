## January 22nd 2019: Merge Sort

[code](../src/main/java/mergesort/MergeSort.java)
[test](../src/test/java/mergesort/MergeSortTest.java)

### Challenge:

Implement a method to merge sort arrays. Merge sort splits the array apart until only sorted portions of the array exist. It then merges them back together in order to create a sorted array.

### Approach and Efficiency:

The implemented method splits the input array into two arrays, it then calls merge on the recursive calls of both those arrays containing half the original array. It continues to do this building a stack of recursive calls until all indexes of the array have been broken into single index arrays. It then merges those arrays back out of the stack until it reaches the original collection of integers, this collection is sorted.

This method is O(n) for time and space.