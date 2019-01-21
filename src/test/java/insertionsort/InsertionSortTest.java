package insertionsort;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void testLeastToGreatest() {

        // Make the Arrays
        int[] testArrayOne = new int[]{7, 2, 3, 5, 4, 1, 6, 9, 8};
        int[] testArrayTwo = new int[]{9, 2, 4, 1, 6, 5, 3, 7, 8};
        int[] testArrayThree = new int[]{1, 2, 3, 4, 5, 7, 6, 8, 9};
        int[] testArraySorted = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Sort the Arrays
        InsertionSort.LeastToGreatest(testArrayOne);
        InsertionSort.LeastToGreatest(testArrayTwo);
        InsertionSort.LeastToGreatest(testArrayThree);

        // Test the Arrays
        assertArrayEquals(testArraySorted, testArrayOne);
        assertArrayEquals(testArraySorted, testArrayTwo);
        assertArrayEquals(testArraySorted, testArrayThree);

    }
}