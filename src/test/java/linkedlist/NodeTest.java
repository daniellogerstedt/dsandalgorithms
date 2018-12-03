package linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

    @Test
    public void constructorNoHead() {
        Node testNode = new Node(5);
        assertEquals("Should create a node with a value of 5", 5, testNode.value);
        assertNull("If no head is provided the next should be null", testNode.next);
    }

    @Test
    public void constructor() {
        Node testNode = new Node(5);
        Node testSecondNode = new Node(4, testNode);
        assertEquals("Should create a node with a value of 5", 4, testSecondNode.value);
        assertEquals("Should set passed in head as next of new Node", testNode, testSecondNode.next);
    }

}