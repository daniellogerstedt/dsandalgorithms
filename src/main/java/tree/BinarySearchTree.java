package tree;

public class BinarySearchTree extends Tree {

    public void add (int v) {
        if (this.root == null) {
            Node<Integer> node = new Node<>(v);
            this.root = node;
        } else {
            Node curr = this.root;
            while (curr != null) {
                if ((int)curr.value < v) {
                    if (curr.right == null) {
                        curr.right = new Node<>(v);
                        return;
                    }
                    else curr = curr.right;
                } else if ((int)curr.value > v) {
                    if (curr.left == null) {
                        curr.left = new Node<>(v);
                        return;
                    }
                    else curr = curr.left;
                } else return;
            }
        }
    }

    public Node search (int v) {
        Node curr = this.root;
        while (curr != null && (int)curr.value != v) {
            curr = (int)curr.value > v? curr.left : curr.right;
        }
        return curr;
    }
}
