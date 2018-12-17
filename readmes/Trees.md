## December 17th: Trees.

### Challenge
Implement Trees in Java with preOrder, inOrder, and postOrder methods to list the contents.
Implement BinarySearchTrees with add and search methods.

### Approach & Efficiency


### preOrder, inOrder, postOrder:

These methods use an outer public function to create an ArrayList then pass the root and Arraylist into the private helper function which iterates recursively over the tree depending on order.

    PreOrder:

    Current Node -> Left Node -> Right Node.

    InOrder:

    Left Node -> Current Node -> Right Node.

    PostOrder:

    Left Node -> Right Node -> Current Node.


### Binary Search Trees:

#### Add:
This method traverses the tree to find the location to place the node based on the other values. It first compares the value of the current node against the inserted value, it then checks the appropriate direction to see if a node is present. If a node is not present it places a node with the value to be inserted at that location, otherwise it moves to that node and compares the values again. If a value already exists of the input value the method does nothing.


#### Search:
This method traverses the tree much like add except instead of adding a node it is looking for a node where the values match. It still moves left or right depending on the comparison between the current node and the input value, however when it finds one that is equal it returns the current node.

#### Movement of current in Add/Search:

    Input Value < Current Node Value -> Move To Left Node

    Input Value > Current Node Value -> Move To Right Node
