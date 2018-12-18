package fizzbuzztree;

import tree.Node;

public class FizzBuzzTree {

    public static void fizzBuzzTree (Node n) {
        if (n == null) return;
        if (n.value instanceof Integer) n.value = ((int)n.value % 3 == 0)? ((int)n.value % 5 == 0)? "FizzBuzz" : "Fizz" : ((int)n.value % 5 == 0)? "Buzz" : n.value;
        if (n.left != null) fizzBuzzTree(n.left);
        if (n.right != null) fizzBuzzTree(n.right);
    }

}
