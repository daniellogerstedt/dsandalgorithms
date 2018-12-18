package fizzbuzztree;

import org.junit.Test;
import tree.Node;
import tree.Tree;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    @Test
    public void testFizzBuzzTree() {
        //Build tree to test
        Tree<Object> testFBT = new Tree<>();
        testFBT.root = new Node<>(1);
        testFBT.root.left = new Node<>(2);
        testFBT.root.left.left = new Node<>(3);
        testFBT.root.left.right = new Node<>(4);
        testFBT.root.right = new Node<>(5);
        testFBT.root.right.left = new Node<>(6);
        testFBT.root.right.right = new Node<>(7);
        testFBT.root.left.left.left = new Node<>(8);
        testFBT.root.left.left.right = new Node<>(9);
        testFBT.root.left.right.left = new Node<>(10);
        testFBT.root.left.right.right = new Node<>(11);
        testFBT.root.right.left.left = new Node<>(12);
        testFBT.root.right.left.right = new Node<>(13);
        testFBT.root.right.right.left = new Node<>(14);
        testFBT.root.right.right.right = new Node<>(15);
        //Run function over tree
        FizzBuzzTree.fizzBuzzTree(testFBT.root);
        //Test tree after method
        assertEquals(1, testFBT.root.value);
        assertEquals(2, testFBT.root.left.value);
        assertEquals("Fizz", testFBT.root.left.left.value);
        assertEquals(4, testFBT.root.left.right.value);
        assertEquals("Buzz", testFBT.root.right.value);
        assertEquals("Fizz", testFBT.root.right.left.value);
        assertEquals(7, testFBT.root.right.right.value);
        assertEquals(8, testFBT.root.left.left.left.value);
        assertEquals("Fizz", testFBT.root.left.left.right.value);
        assertEquals("Buzz", testFBT.root.left.right.left.value);
        assertEquals(11, testFBT.root.left.right.right.value);
        assertEquals("Fizz", testFBT.root.right.left.left.value);
        assertEquals(13, testFBT.root.right.left.right.value);
        assertEquals(14, testFBT.root.right.right.left.value);
        assertEquals("FizzBuzz", testFBT.root.right.right.right.value);
    }
}