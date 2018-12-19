package tree;

import stacksandqueues.Queue;

public class TreeBreadthTraversal<T> extends Tree<T> {

    public static void print(Tree t) {
        Queue<Node> q = new Queue<>();
        Node n = t.root;
        while (n != null) {
            if (n.left != null) q.enqueue(n.left);
            if (n.right != null) q.enqueue(n.right);
            System.out.println(n.value);
            n = q.peek() == null? null : (Node)q.dequeue().value;
        }
    }

}
