package treeintersection;

import org.junit.Test;
import tree.Node;
import tree.Tree;

import java.util.List;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    @Test
    public void findIntersections() {
        Tree testTreeOne = new Tree();
        testTreeOne.root = new Node<>(1);
        testTreeOne.root.right = new Node<>(5);
        testTreeOne.root.left = new Node<>(2);
        testTreeOne.root.left.left = new Node<>(3);
        testTreeOne.root.left.right = new Node<>(4);
        testTreeOne.root.right.right = new Node<>(7);
        testTreeOne.root.right.left = new Node<>(6);
        testTreeOne.root.left.right.left = new Node<>(10);
        testTreeOne.root.left.left.left = new Node<>(8);
        testTreeOne.root.left.left.right = new Node<>(9);

        Tree testTreeTwo = new Tree();
        testTreeTwo.root = new Node<>(1);
        testTreeTwo.root.right = new Node<>(30);
        testTreeTwo.root.left = new Node<>(45);
        testTreeTwo.root.left.left = new Node<>(200);
        testTreeTwo.root.left.right = new Node<>(4);
        testTreeTwo.root.right.right = new Node<>(7);
        testTreeTwo.root.right.left = new Node<>(5000);
        testTreeTwo.root.left.right.left = new Node<>(10);
        testTreeTwo.root.left.left.left = new Node<>(80);
        testTreeTwo.root.left.left.right = new Node<>(9);

        List<Integer> answer = TreeIntersection.findIntersections(testTreeOne, testTreeTwo);
        assertEquals(5, answer.size());
        assertEquals("[9, 10, 4, 1, 7]", answer.toString());
        assertTrue(answer.contains(9));
        assertTrue(answer.contains(10));
        assertTrue(answer.contains(4));
        assertTrue(answer.contains(1));
        assertTrue(answer.contains(7));




    }
}