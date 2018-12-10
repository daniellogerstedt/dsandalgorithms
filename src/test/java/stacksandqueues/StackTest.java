package stacksandqueues;

import org.junit.Test;

import static junit.framework.TestCase.*;

public class StackTest {

    @Test
    public void testConstructor() {
        Stack testStack = new Stack();
        assertNull("top should be null on instantiation", testStack.top);
    }

    @Test
    public void testPush() {
        Stack testStack = new Stack();
        testStack.push(1);
        assertEquals("should contain the value 1 in the top Node", 1, testStack.top.value);
        assertNull("top next should be null", testStack.top.next);


    }

    @Test
    public void testPeek() {
        Stack testStack = new Stack();
        assertNull("peek should return null on an empty stack", testStack.peek());
        testStack.push(1);
        Node testNode = testStack.top;
        assertTrue("top value should be 1 and peek should return that 1", testStack.peek() == 1);
        assertNotNull("top should still remain after peeking", testStack.top);
        assertEquals("Node at top should not change from peek", testNode, testStack.top);
    }

    @Test
    public void testPop() {
        Stack testStack = new Stack();
        testStack.push(1);
        testStack.push(2);
        Node testNode = testStack.top;
        assertTrue("top value should be 2", testStack.peek() == 2);
        Node poppedNode = testStack.pop();
        assertTrue("top value should be 1", testStack.peek() == 1);
        assertEquals("Should be previous top that was popped", testNode, poppedNode);
        assertNotSame("Node at top should not be previous top", poppedNode, testStack.top);
    }
}