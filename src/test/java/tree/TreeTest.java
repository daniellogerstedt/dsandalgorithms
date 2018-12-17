package tree;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TreeTest {

    @Test
    public void testConstructor() {
        Tree tree = new Tree();
        assertNull(tree.root);

    }

    @Test
    public void testPreOrderList() {
        Tree testTree = new Tree();
        testTree.root = new Node<>(10);
        testTree.root.left = new Node<>(5);
        testTree.root.right = new Node<>(15);
        List<Node> testArray = testTree.preOrderList();
        assertEquals(10, testArray.get(0).value);
        assertEquals(5, testArray.get(1).value);
        assertEquals(15, testArray.get(2).value);
    }

    @Test
    public void testInOrderList() {
        Tree testTree = new Tree();
        testTree.root = new Node<>(10);
        testTree.root.left = new Node<>(5);
        testTree.root.right = new Node<>(15);
        List<Node> testArray = testTree.inOrderList();
        assertEquals(5, testArray.get(0).value);
        assertEquals(10, testArray.get(1).value);
        assertEquals(15, testArray.get(2).value);

    }

    @Test
    public void testPostOrderList() {
        Tree testTree = new Tree();
        testTree.root = new Node<>(10);
        testTree.root.left = new Node<>(5);
        testTree.root.right = new Node<>(15);
        List<Node> testArray = testTree.postOrderList();
        assertEquals(5, testArray.get(0).value);
        assertEquals(15, testArray.get(1).value);
        assertEquals(10, testArray.get(2).value);


    }
}