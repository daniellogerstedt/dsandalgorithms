package QueueWithStacks;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNotSame;
import static junit.framework.TestCase.assertNull;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

public class QueueWithStacksTest {

    @Test
    public void testEnqueue() {
        QueueWithStacks<String> testQueue = new QueueWithStacks<String>();
        testQueue.enqueue("test");
        assertEquals("should contain the value \"test\" in the front Node", "test", testQueue.inStack.top.value);
        assertNull("front next should be null", testQueue.inStack.top.next);


    }

    @Test
    public void testPeek() {
        QueueWithStacks<Integer> testQueue = new QueueWithStacks<Integer>();
        assertNull("peek should return null on an empty Queue", testQueue.peek());
        testQueue.enqueue(1);
        Node testNode = testQueue.inStack.top;
        assertTrue("front value should be 1 and peek should return that 1", testQueue.peek() == 1);
        assertNotNull("front should still remain after peeking", testQueue.outStack.top);
        assertEquals("Node at front should not change from peek", testNode.value, testQueue.outStack.top.value);
    }

    @Test
    public void testDequeue() {
        QueueWithStacks<Integer> testQueue = new QueueWithStacks<Integer>();
        testQueue.enqueue(1);
        Node testNode = testQueue.inStack.top;
        testQueue.enqueue(2);
        Node dequeuedNode = testQueue.dequeue();
        assertTrue("front value should be 2", testQueue.peek() == 2);
        assertEquals("Should be previous front that was popped", testNode.value, dequeuedNode.value);
        assertNotSame("Node at front should not be previous front", dequeuedNode.value, testQueue.outStack.top.value);
    }

}