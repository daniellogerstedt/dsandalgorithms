## December 20th: Find Maximum Value in Tree

### Challenge
Implement a method that finds the highest value node in the tree and returns it.

### Approach & Efficiency

-> [Code](../src/main/java/tree/FindMaxBinaryTree.java) <- -> [Testing](../src/test/java/tree/FindMaxBinaryTreeTest.java) <-

First the wrapper method verifies that the root is not null.

    if (this.root == null) return max;

Next the method sets the value of the instance variable "max" to equal the root value and invokes the helper method to set the max value on the instance before returning max.

    this.max = (int)this.root.value;
    setMax(this.root);
    return this.max;

The helper method, setMax, is a recursive method that compares the current value of "this.max" to the value of the node passed into it setting the highest to be the maximum using "Math.max".

    private void setMax(Node<Integer> root) {
        if (root == null) return;
        this.max = Math.max(this.max , (int)root.value);
        setMax(root.left);
        setMax(root.right);
    }

This solution is Big O(1) for space as it doesn't use any additional memory and Big O(n) for time on the stack.

### Solution

<img src="../assets/FindMaxTree.jpg" height=500 />