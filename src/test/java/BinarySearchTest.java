import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void binarySearch() {
        BinarySearch classUnderTest = new BinarySearch();
        int[] testArrayOne = new int[]{1, 2, 3, 4, 5};
        int[] testArrayTwo = new int[]{2, 4, 6, 8, 10};
        int[] testArrayThree = new int[]{22, 38, 144, 299, 500};
        int[] testArrayFour = new int[]{1, 1, 1, 1, 1, 1, 2};

        assertEquals("Should find and return index 1 for the number 2", 1, classUnderTest.BinarySearch(testArrayOne, 2));
        assertEquals("Should find and return index 0 for the number 2", 0, classUnderTest.BinarySearch(testArrayTwo, 2));
        assertEquals("Should find and return index -1 for the number 0", -1, classUnderTest.BinarySearch(testArrayThree, 0));
        assertEquals("Should find and return index 6 for the number 1", 6, classUnderTest.BinarySearch(testArrayFour, 2));
    }
}