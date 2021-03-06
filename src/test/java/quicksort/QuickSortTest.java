package quicksort;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void testSort() {

        // Make the Arrays
        int[] testArrayOne = new int[]{7, 2, 3, 5, 4, 1, 6, 9, 8};
        int[] testArrayTwo = new int[]{9, 2, 4, 1, 6, 5, 3, 7, 8};
        int[] testArrayThree = new int[]{1, 2, 3, 4, 5, 7, 6, 8, 9};
        int[] testArraySorted = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Sort the Arrays
        QuickSort.sort(testArrayOne, testArrayOne.length - 1, 0);
        QuickSort.sort(testArrayTwo, testArrayTwo.length - 1, 0);
        QuickSort.sort(testArrayThree,testArrayThree.length - 1, 0);

        // Test the Arrays
        assertArrayEquals(testArraySorted, testArrayOne);
        assertArrayEquals(testArraySorted, testArrayTwo);
        assertArrayEquals(testArraySorted, testArrayThree);




    }
}