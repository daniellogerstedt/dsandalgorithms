package repeatedword;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {

    @Test
    public void testFirstRepeated() {
        assertNull(RepeatedWord.firstRepeated("How Now Brown Cow"));
        assertEquals("the", RepeatedWord.firstRepeated("The Seahawks won the superbowl"));
        assertEquals("b", RepeatedWord.firstRepeated("A B B B B B B B B B A"));
        assertEquals("c", RepeatedWord.firstRepeated("A C B C B B B B B B A"));
    }
}