package stacksandqueues;

import org.junit.Test;

import static junit.framework.TestCase.*;

public class NodeTest {

    @Test
    public void testConstructor() {
        Node testNode = new Node(1);
        assertEquals("testNode should have a value of 1", 1, testNode.value);
        assertNull("testNode should have next value of Null", testNode.next);
        Node testNodeTwo = new Node(2, testNode);
        assertEquals("testNodeTwo should have next value of testNode", testNode, testNodeTwo.next);
    }

}