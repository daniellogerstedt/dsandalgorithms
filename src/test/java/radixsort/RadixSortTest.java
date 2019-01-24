package radixsort;

import org.junit.Test;

import static org.junit.Assert.*;

public class RadixSortTest {

    @Test
    public void testRadixLSD() {

        // Make the Arrays
        int[] testArrayOne = new int[]{793, 284, 300, 95, 184};
        int[] testArrayTwo = new int[]{95, 184, 284, 793, 300};
        int[] testArrayThree = new int[]{300, 284, 184, 95, 793};
        int[] testArraySorted = new int[]{95, 184, 284, 300, 793};

        // Sort the Arrays
        RadixSort.radixLSD(testArrayOne);
        RadixSort.radixLSD(testArrayTwo);
        RadixSort.radixLSD(testArrayThree);

        // Test the Arrays
        assertArrayEquals(testArraySorted, testArrayOne);
        assertArrayEquals(testArraySorted, testArrayTwo);
        assertArrayEquals(testArraySorted, testArrayThree);

    }
}