## January 21st 2019: Insertion Sort

[code](../src/main/java/insertionsort/InsertionSort.java)
[test](../src/test/java/insertionsort/InsertionSortTest.java)

### Challenge:

Implement a method to sort an array through an insertion sort algorithm. Insertion sort is where the algorithm takes the current index and inserts it into the sorted values where it belongs before moving to the next index.

### Approach and Efficiency:

The method for insertion sort is fairly simple to implement, it involves iterating through the array one index at a time and inside that iteration iterating backward with the current index until you find the position and leave it there. This inside backward iteration swaps the value of the current position with the previous before moving until it finds that the previous is less than the current. Because of this the value of each previous index to the outer iteration is sorted as it moves and only the untouched portion of the array remains unsorted.

This method is O(n * k) time where k is the maximum distance an index must be moved till it reaches the sorted position. In worst case where all index must be moved the maximum number of places it becomes O(n<sup>2</sup>) this becomes the case in reversed arrays.

This method is O(1) space because it handles all operations in place.