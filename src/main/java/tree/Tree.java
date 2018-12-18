package tree;

import java.util.ArrayList;
import java.util.List;

public class Tree<T> {

    public Node<T> root = null;

    public Tree () {}

    public List<Node<T>> preOrderList () {
        List<Node<T>> theArray = new ArrayList<>();
        Node<T> node = this.root;
        if (node != null) preOrderListRun(node, theArray);
        return theArray;
    }

    private void preOrderListRun (Node<T> node, List theArray) {
        theArray.add(node);
        if (node.left != null) preOrderListRun(node.left, theArray);
        if (node.right != null) preOrderListRun(node.right, theArray);
    }

    public List<Node<T>> inOrderList () {
        List<Node<T>> theArray = new ArrayList<>();
        Node<T> node = this.root;
        if (node != null) inOrderListRun(node, theArray);
        return theArray;
    }

    private void inOrderListRun (Node<T> node, List theArray) {
        if (node.left != null) inOrderListRun(node.left, theArray);
        theArray.add(node);
        if (node.right != null) inOrderListRun(node.right, theArray);
    }

    public List<Node<T>> postOrderList () {
        List<Node<T>> theArray = new ArrayList<>();
        Node<T> node = this.root;
        if (node != null) postOrderListRun(node, theArray);
        return theArray;
    }

    private void postOrderListRun (Node<T> node, List theArray) {
        if (node.left != null) postOrderListRun(node.left, theArray);
        if (node.right != null) postOrderListRun(node.right, theArray);
        theArray.add(node);
    }
}
