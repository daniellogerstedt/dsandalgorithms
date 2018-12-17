package tree;

import java.util.ArrayList;
import java.util.List;

public class Tree {

    protected Node root = null;

    public Tree () {}

    public List<Node> preOrderList () {
        List<Node> theArray = new ArrayList<>();
        Node node = this.root;
        if (node != null) preOrderListRun(node, theArray);
        return theArray;
    }

    private void preOrderListRun (Node node, List theArray) {
        theArray.add(node);
        if (node.left != null) preOrderListRun(node.left, theArray);
        if (node.right != null) preOrderListRun(node.right, theArray);
    }

    public List<Node> inOrderList () {
        List<Node> theArray = new ArrayList<>();
        Node node = this.root;
        if (node != null) inOrderListRun(node, theArray);
        return theArray;
    }

    private void inOrderListRun (Node node, List theArray) {
        if (node.left != null) inOrderListRun(node.left, theArray);
        theArray.add(node);
        if (node.right != null) inOrderListRun(node.right, theArray);
    }

    public List<Node> postOrderList () {
        List<Node> theArray = new ArrayList<>();
        Node node = this.root;
        if (node != null) postOrderListRun(node, theArray);
        return theArray;
    }

    private void postOrderListRun (Node node, List theArray) {
        if (node.left != null) postOrderListRun(node.left, theArray);
        if (node.right != null) postOrderListRun(node.right, theArray);
        theArray.add(node);
    }
}
