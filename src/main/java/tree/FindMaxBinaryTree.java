package tree;

public class FindMaxBinaryTree<Integer> extends Tree<Integer> {
    public int max;

    public int findMax() {
        if (this.root == null) return max;
        this.max = (int)this.root.value;
        setMax(this.root);
        return this.max;
    }

    private void setMax(Node<Integer> root) {
        if (root == null) return;
        this.max = Math.max(this.max , (int)root.value);
        setMax(root.left);
        setMax(root.right);
    }
}
