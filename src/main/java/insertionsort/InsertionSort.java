package insertionsort;

public class InsertionSort {


    // Documentation for Insertion Sort: https://en.wikipedia.org/wiki/Insertion_sort

    public static void LeastToGreatest (int[] inputArray) {
        // Loop through the array
        int i = 1;
        while (i < inputArray.length) {
            int j = i;
            // Swap values where needed by moving the current index backward through the array until it reaches the required positioning.
             while (j > 0 && inputArray[j - 1] > inputArray[j]) {
                int holder = inputArray[j - 1];
                inputArray[j - 1] = inputArray[j];
                inputArray[j] = holder;
                j--;
            }
            i++;
        }
    }


}
