import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {

    @Test
    public void insertShiftArray() {
        int[] testArray = new int[] {1, 2, 4, 5, 99};
        ArrayShift classUnderTest = new ArrayShift();
        int[] testRun = classUnderTest.insertShiftArray(testArray, 3);
        assertEquals("Inserts and Shifts array elements to include the number increasing length by 1", 6, testRun.length);
        assertEquals("The number 3 was inserted into the correct position numerically at index 2 and not simply added to an array at random", 3, testRun[3]);
        assertTrue("returned data type is integer array and not another data type with similar characteristics", testRun instanceof int[]);
    }
}