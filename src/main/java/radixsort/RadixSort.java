package radixsort;

// Solution adapted from solution at https://en.wikipedia.org/wiki/Radix_sort

public class RadixSort {

    public static void radixLSD (int[] arr) {

        // Run the array through get max to get the largest value
        int highestValue = getMax(arr);

        // Run the count sort on every digit of the values in the array.
        for (int digit = 1; highestValue/digit > 0; digit *= 10) {
            sortDigit(arr, digit);
        }

    }

    // This method is a helper method used to get the largest value in the array to determine stop point for digit count sorting.
    private static int getMax (int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }


    private static void sortDigit (int[] arr, int digit) {

        // Output of specific digit sorting for manipulation of input array
        int[] output = new int[arr.length];

        // Index to be set and used for loops
        int i;

        // Counting array for keeping track of number of counted numbers of 0-9
        int[] count = new int[10];

        // Count up the occurrences of each number
        for (i = 0; i < arr.length; i++) {
        // The math contained below takes the value at the input array index position i. It divides this value by the digit position being sorted currently (100 for example would represent the 100s digit). It then remainders off the unwanted digit information to find where the current digit falls between 0 and 9 and increments that position in the count array.
            count[(arr[i]/digit)%10]++;
        }

        // Adding the index value to the count position for later use in placing the values in their correct index. If index 6 for example of the count array has 1 value that lands in 6 it becomes 6 while if it has 2 values it becomes 7. This allows for the system to move backward through the original array placing the values based off this index value.
        for (i = 1; i < 10; i++) {
            count[i] += count[i-1];
        }

        // Creating the output array for this round of the sort based off the positions held in the count array. It does this backward through the array to remain stable in positioning through each sorting pass. The count is then decremented to move the next index to land on a specific digit one further forward maintaining its positioning relative to those that share the same digit value.
        for (i = arr.length - 1; i >= 0; i--) {
            output[ count[ (arr[i] / digit) %10 ] - 1 ] = arr[i];
            count[ (arr[i] / digit) %10 ]--;
        }

        // Sets the original array values to match their new positions. This is what changes the original array and actually sorts it.
        for (i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }


    }

}
