package tree;

import org.apache.commons.math3.analysis.function.Max;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaxBinaryTreeTest {

    @Test
    public void testFindMax() {
        FindMaxBinaryTree MaxTreeTest = new FindMaxBinaryTree();

        // Asserts that with an empty tree it should return 0 as the maximum.
        assertEquals(0, MaxTreeTest.findMax());

        // Add Nodes
        MaxTreeTest.root = new Node<>(1);
        MaxTreeTest.root.right = new Node<>(5);
        MaxTreeTest.root.left = new Node<>(2);
        MaxTreeTest.root.left.left = new Node<>(3);
        MaxTreeTest.root.left.right = new Node<>(4);
        MaxTreeTest.root.right.right = new Node<>(7);
        MaxTreeTest.root.right.left = new Node<>(6);
        MaxTreeTest.root.left.right.left = new Node<>(10);
        MaxTreeTest.root.left.left.left = new Node<>(8);
        MaxTreeTest.root.left.left.right = new Node<>(9);

        // Asserts that 10 should be the maximum regardless of the order it was added to the tree.
        assertEquals(10, MaxTreeTest.findMax());

        // Add More Nodes
        MaxTreeTest.root.left.right.right = new Node<>(11);
        MaxTreeTest.root.right.left.left = new Node<>(12);
        MaxTreeTest.root.right.left.right = new Node<>(13);
        MaxTreeTest.root.right.right.left = new Node<>(14);
        MaxTreeTest.root.right.right.right = new Node<>(15);

        // Asserts that 15 should be the new maximum after more nodes are added
        assertEquals(15, MaxTreeTest.findMax());

        // Add New Root
        Node tempN = MaxTreeTest.root;
        MaxTreeTest.root = new Node<>(12);
        MaxTreeTest.root.left = tempN;

        // Asserts that 15 should still be the maximum if the root is changed to a new root containing the previous tree as a child tree
        assertEquals(15, MaxTreeTest.findMax());
    }
}