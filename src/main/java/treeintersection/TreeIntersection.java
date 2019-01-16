package treeintersection;

import hashtable.HashTable;
import tree.Node;
import tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class TreeIntersection {

    private static List<Integer> intersections;
    private static HashTable<Integer> numbersOfTreeOne;

    public static List<Integer> findIntersections (Tree<Integer> treeOne, Tree<Integer> treeTwo) {
        intersections = new ArrayList<>();
        numbersOfTreeOne = new HashTable<>();
        for (Node<Integer> node : treeOne.inOrderList()) {
            numbersOfTreeOne.add("" + node.value, node.value);
        }
        for (Node<Integer> node : treeTwo.inOrderList()) {
            if (numbersOfTreeOne.contains("" + node.value)) intersections.add(node.value);
        }
        return intersections;
    }

}
