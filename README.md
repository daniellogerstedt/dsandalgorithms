#Data Structures and Algorithms Problems:

##November 26th: Reverse an array.

### Challenge
Reverse an array.

### Approach & Efficiency
Uses a method built to reverse string arrays. This method works by looping half way through the array reversing it by swapping indexes based on the value of "i"

This approach is Big O(1) for space and O(log n) for time because it creates space for the array and does not duplicate it in the process of manipulating it.
It also only loops half of the length. Where n is the size of the array and time it takes to iterate over the entire array.

### Solution
Inline-style:
![solution image](./assets/reverseArray.jpg)

##November 27th: Add a number to an array.

### Challenge
Add a number to an array.

### Approach & Efficiency
Uses a method to insert a number into an array in the numerical position.

This approach is Big O(n) for space and O(n) for time because it creates a duplicate array containing the values and iterates through the entire array one time.

### Solution
Inline-style:
![solution image](./assets/insertNumberPseudo.jpg)

Inline-style:
![solution image](./assets/insertNumberCode.jpg)


##November 27th: Add a number to an array.

### Challenge
Binary Search of an Array

### Approach & Efficiency
After reading up on Binary Search at on wikipedia (src: https://en.wikipedia.org/wiki/Binary_search_algorithm) I decided to rebuild the algorithm in from C to Java.

This approach is Big O(1) for space and O(log n)
It does not create a duplicate of the array and only uses minor space increases to store temporary integers in the search process
The time used can be calculated on a logarithmic curve.

### Solution
Inline-style:
![solution image](./assets/array_binary_search.jpg)

