package linkedlist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class LinkedListTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void constructor() {
        LinkedList testList = new LinkedList();
        assertNull("Should instantiate the Linked List object with null for the head.", testList.head);
    }

    @Test
    public void insertFirstNode() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        assertEquals("Should insert a node containing the value 5 at the head", 5, testList.head.value);
        assertTrue("Head should be instance of Node class.", testList.head instanceof Node);
        assertNull("Head next should be null before any other head exists", testList.head.next);
    }

    @Test
    public void insertSecondNode() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        Node testNode = testList.head;
        testList.insert(4);
        assertEquals("Should insert a node containing the value 4 at the head", testNode, testList.head.next);
        assertNull("2nd Node next should be null before any other head exists", testList.head.next.next);
    }

    @Test
    public void includes() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(4);
        testList.insert(42);
        testList.insert(53);
        assertTrue("Should be able to locate Nodes at the end of the list", testList.includes(5));
        assertTrue("Should be able to locate Nodes at the start of the list", testList.includes(53));
        assertTrue("Should be able to locate Nodes in the middle of the list", testList.includes(42));
    }

    @Test
    public void print() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(4);
        testList.insert(42);
        testList.insert(53);
        testList.print();

        assertEquals("Should print a list of numbers to System.out.println", "53\n42\n4\n5\n", outContent.toString());
    }

    @Test
    public void testAppend() {
        LinkedList testList = new LinkedList();
        testList.append(5);
        assertEquals("Should be able to locate Nodes at the end of the list", 5, testList.head.value);
        testList.append(4);
        assertEquals("Should be able to locate Nodes at the start of the list", 4, testList.head.next.value);
        testList.append(53);
        assertEquals("Should be able to locate Nodes in the middle of the list", 53, testList.head.next.next.value);
    }

    @Test
    public void testInsertBefore() {
        LinkedList testList = new LinkedList();
        testList.insert(53);
        testList.insert(5);
        testList.insertBefore(53, 4);
        assertEquals("5 should remain at the beginning of the list after 4 is inserted", 5, testList.head.value);
        assertEquals("4 should be placed in the middle of the list after 5", 4, testList.head.next.value);
        assertEquals("53 should remain at the end of the list after 4 is inserted", 53, testList.head.next.next.value);
    }

    @Test
    public void testInsertAfter() {
        LinkedList testList = new LinkedList();
        testList.insert(53);
        testList.insert(5);
        testList.insertAfter(5, 4);
        assertEquals("5 should remain at the beginning of the list after 4 is inserted", 5, testList.head.value);
        assertEquals("4 should be placed in the middle of the list after 5", 4, testList.head.next.value);
        assertEquals("53 should remain at the end of the list after 4 is inserted.", 53, testList.head.next.next.value);
    }
}