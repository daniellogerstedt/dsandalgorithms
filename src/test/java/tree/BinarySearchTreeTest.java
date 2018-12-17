package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void testConstructor() {
        Tree testBinary = new BinarySearchTree();
        assertNull(testBinary.root);
    }

    @Test
    public void testAdd() {
        BinarySearchTree testBinary = new BinarySearchTree();
        testBinary.add(10);
        assertNotNull(testBinary.root);
        assertNull(testBinary.root.left);
        assertNull(testBinary.root.right);
        assertEquals(10, testBinary.root.value);
        testBinary.add(5);
        assertNull(testBinary.root.right);
        assertNull(testBinary.root.left.left);
        assertNull(testBinary.root.left.right);
        assertEquals(5, testBinary.root.left.value);
        testBinary.add(15);
        assertNull(testBinary.root.left.left);
        assertNull(testBinary.root.left.right);
        assertNull(testBinary.root.right.left);
        assertNull(testBinary.root.right.right);
        assertEquals(15, testBinary.root.right.value);
        testBinary.add(10);
        assertEquals(3, testBinary.inOrderList().size());
    }

    @Test
    public void testSearch() {
        BinarySearchTree testBinary = new BinarySearchTree();
        testBinary.add(5);
        testBinary.add(3);
        testBinary.add(4);
        testBinary.add(2);
        testBinary.add(7);
        testBinary.add(6);
        testBinary.add(8);
        Node testRoot = testBinary.search(5);
        Node testRootL = testBinary.search(3);
        Node testRootLL = testBinary.search(2);
        Node testRootLR = testBinary.search(4);
        Node testRootR = testBinary.search(7);
        Node testRootRL = testBinary.search(6);
        Node testRootRR = testBinary.search(8);
        assertEquals(testBinary.root, testRoot);
        assertEquals(testBinary.root.left, testRootL);
        assertEquals(testBinary.root.right, testRootR);
        assertEquals(testBinary.root.left.left, testRootLL);
        assertEquals(testBinary.root.left.right, testRootLR);
        assertEquals(testBinary.root.right.left, testRootRL);
        assertEquals(testBinary.root.right.right, testRootRR);
    }
}