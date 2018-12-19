## December 18th: Fizz Buzz Trees.

### Challenge
Implement a method that traverses a tree of objects and changes any values that are divisible by 3 to "Fizz", divisible by 5 to "Buzz" and divisible by both to "FizzBuzz"


### Approach & Efficiency

-> [Code](../src/main/java/fizzbuzztree/FizzBuzzTree.java) <- -> [Testing](../src/test/java/fizzbuzztree/FizzBuzzTreeTest.java) <-

The first step is to verify the node passed in is not null, this is done to correct errors that would occur from an empty root being passed into the method.

    if (n == null) return;

Traverse the tree, on each node modulo the value against 3 and 5 and compare to 0. If the number is divisible by either it will have a remainder of 0.

    Modulos in JavaScript: (Has type coercion)
        5 % 5 -> 0 -> Truthy (5 is divisible by 5 with a remainder of 0)
        5 % 3 -> 2 -> Falsy (5 is divisible by 5 with a remainder of 2)
        1 % 3 -> 1 -> Falsy (1 is not divisible by 3)

    Modulos in Java: (Does not have type coercion)
        5 % 5 -> 0 (5 is divisible by 5 with a remainder of 0)
        5 % 3 -> 2 (5 is divisible by 5 with a remainder of 2)
        1 % 3 -> 1 (1 is not divisible by 3)

When it finds a value equalling 0 in the division by 3 it then checks the division by 5 and will set the value to FizzBuzz if both are 0 or Fizz if not. If the number is not divisible by 3 it will check if it is divisible by 5 setting the value to Buzz if it is and otherwise leaving it as the original value.

    if (n.value instanceof Integer) n.value = ((int)n.value % 3 == 0)
        ? ((int)n.value % 5 == 0)? "FizzBuzz" : "Fizz"
        : ((int)n.value % 5 == 0)? "Buzz" : n.value;

After comparing the value the method then checks if the left and right children of the node are null. In the event they are not it recursively invokes the function on any that are not. This pattern continues until all nodes have been traversed.

    if (n.left != null) fizzBuzzTree(n.left);
    if (n.right != null) fizzBuzzTree(n.right);

This solution is Big O(1) for space as it doesn't use any additional memory and Big O(n) for time on the Stack since it recursively repeats on all Nodes in the tree.

### Solution

<img src="../assets/FizzBuzzTree.jpg" height=500 />



