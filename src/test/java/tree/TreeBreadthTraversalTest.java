package tree;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class TreeBreadthTraversalTest {

    // Println testing -> https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println

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
    public void breadthFirstPrint() {
        TreeBreadthTraversal testTree = new TreeBreadthTraversal();
        testTree.print(testTree);

        // Test Empty Tree
        assertEquals("", outContent.toString());

        // Add Nodes
        testTree.root = new Node<>(1);
        testTree.root.left = new Node<>(2);
        testTree.root.left.left = new Node<>(4);
        testTree.print(testTree);

        // Test Lopsided Tree
        assertEquals("1\n2\n4\n", outContent.toString());

        // Add More Nodes
        testTree.root.right = new Node<>(3);
        testTree.root.left.right = new Node<>(5);
        testTree.root.right.left = new Node<>(6);
        testTree.root.right.right = new Node<>(7);
        testTree.print(testTree);

        // Test Balanced Tree
        assertEquals("1\n2\n4\n1\n2\n3\n4\n5\n6\n7\n", outContent.toString());


    }
}