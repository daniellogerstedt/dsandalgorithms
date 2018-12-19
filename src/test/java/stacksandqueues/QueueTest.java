package stacksandqueues;

import org.junit.Test;

import static junit.framework.TestCase.*;

public class QueueTest {

    @Test
    public void testConstructor() {
        Queue testQueue = new Queue();
        assertNull("front should be null on instantiation", testQueue.front);
    }

    @Test
    public void testEnqueue() {
        Queue testQueue = new Queue();
        testQueue.enqueue(1);
        assertEquals("should contain the value 1 in the front Node", 1, testQueue.front.value);
        assertNull("front next should be null", testQueue.front.next);


    }

    @Test
    public void testPeek() {
        Queue testQueue = new Queue();
        assertNull("peek should return null on an empty Queue", testQueue.peek());
        testQueue.enqueue(1);
        Node testNode = testQueue.front;
        assertTrue("front value should be 1 and peek should return that 1", (int)testQueue.peek() == 1);
        assertNotNull("front should still remain after peeking", testQueue.front);
        assertEquals("Node at front should not change from peek", testNode, testQueue.front);
    }

    @Test
    public void testDequeue() {
        Queue testQueue = new Queue();
        testQueue.enqueue(1);
        testQueue.enqueue(2);
        Node testNode = testQueue.front;
        Node dequeuedNode = testQueue.dequeue();
        assertTrue("front value should be 2", (int)testQueue.peek() == 2);
        assertEquals("Should be previous front that was popped", testNode, dequeuedNode);
        assertNotSame("Node at front should not be previous front", dequeuedNode, testQueue.front);
    }
}