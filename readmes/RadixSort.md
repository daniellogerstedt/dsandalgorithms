## January 24rd, 2019: Radix Sort

[code](../src/main/java/radixsort/RadixSort.java)
[test](../src/test/java/radixsort/RadixSortTest.java)

### Challenge:

Implement a Radix Sort method. Radix sort takes the values of each digit of elements of an array and sorts them based off their placement. For example the numbers \[17, 93, 87] would sort in two steps of the method:

    First sort by the 1s digit and be [93, 17, 87]
    Second sort by the 10s digit and be [17, 87, 93]

 This is because the sorting method used within Radix to sort individual digits is stable and maintains original positioning of digits that are the same.

### Approach and Efficiency:

The method I implemented is modeled after the code and explanation found while reading the wikipedia page on radix and how it works. The code consists of a wrapper function and two helper functions.

#### Wrapper Method: radixLSD()

The wrapper method utilizes the helper method getMax to get the highest value in the array for use when looping through the second helper method.

It then loops through multiple invocations of the second helper method sortDigit.

#### Helper Method: getMax()

This method is a simple maximum finding method that loops through the array one time finding the highest value and returning it. It does this by first setting an integer to the smallest integer number that Java can handle: -2<sup>31</sup>

    int max = Integer.MIN_VALUE;

This integer value is then compared to each element of the array and any time a greater value is found it is replaced with that value. Once all values have been compared it returns the integer.

#### Helper Method: sortDigit( int[ ] arr, int digit )

This is the heart of the radix sort, its purpose is to sort an array by a given digit. The digit it works with is provided as the digit (10 for 10s for example). The method first creates an output array, to hold the finished sort before changing the input array, and a count array, to hold the count of each matching digit. This method can then be broken down into four parts:

1. Count up the occurrences of each number.

    This loop counts each occurrence of individual digit values 0-9. It does this by looping through the array provided and first dividing the value by the provided digit value and then remaindering the number to remove anything except the desired digit value.

        ( arr[i] / digit ) % 10 // arr[i] = 23 and digit = 10 provides integer 2

    The count array is then incremented at the index provided to track how many of that digit have appeared.

1. Alter the count array to represent location of values with the digits found.

    This is accomplished by adding the index value to the count position for later use in placing the values in their correct index. If index 6 for example of the count array has 1 value that lands in 6 it becomes 6 while if it has 2 values it becomes 7. This allows for the system to move backward through the original array placing the values based off this index value.

1. Move backward through input array placing values in output positions

    Creating the output array for the specific round of the sort based off the positions held in the count array. It does this backward through the array to remain stable in positioning through each sorting pass. The count is then decremented to move the next index to land on a specific digit one further forward maintaining its positioning relative to those that share the same digit value.

1. Alter input array with output data to sort the given digit

    This is completed by iterating through the input array and setting each value to the value present in the matching output array index. Because of the other three parts the output array values are sorted by the digit provided for sorting.

### Big O:

This implementation of radix sort is O(n * d) for time where d is the largest number of digits in the array provided. This is because in an array of single digit numbers it only needs to iterate over the array four times linearly.

This implementation of radix sort is in place however it requires the creation of atleast one output array of equal size to the input array making it O(n) for size.


### Documentation used in researching radix sort:

[Radix Sort Wikipedia Page](https://en.wikipedia.org/wiki/Radix_sort)