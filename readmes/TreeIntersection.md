## January 16th 2019: Tree Intersection

[code](../src/main/java/treeintersection/TreeIntersection.java)
[test](../src/test/java/treeintersection/TreeIntersection.java)

### Challenge:

Implement a method that takes in two trees and returns any values that are shared between the two trees.

### Approach and Efficiency:

The method built takes the first tree and iterates through it with an in order traversal adding each node to a hash table. It then takes the second tree and checks to see if the hash table contains the nodes present. Any time it finds a node in the second tree that is present in the hash table it adds it to an ArrayList to return at the end.

This method is O(n<sup>2</sup>) Time and O(n) Space