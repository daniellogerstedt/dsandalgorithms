## January 14th 2019: Hash Tables.

[code](../src/main/java/hashtable/HashTable.java)
[test](../src/test/java/hashtable/HashTableTest.java)

### Challenge:

Implement a Hash Table that allows the storage of key value pairs and retrieval of those pairs.


### Approach and Efficiency:

The Hash Table implemented contains a single private class "DataNode". DataNodes are used to store the key and value for easy look up. They are stored on the hashed location of the key. The implemented Hash Table uses LinkedLists to store colliding data and uses the key on the DataNode to differentiate between data in those lists as needed.

### getHash

The hash method is a very simple string to int method that takes the key, finds the sum of the int value of all its characters then uses a modulo to find its location in the table.

This method is O(1) Time and Space

### add

This method takes the key and value, it then hashes the key and adds a new DataNode to the location in the hash table

This method is O(1) Time and Space

### find

This method takes the key to find, it hashes the key then it locates the DataNode with the requested key based off the returned hash. It then returns the data associated with that key

This method is O(n) Time (All data collides and it results in one giant linked list) and O(1)

### contains

This method operates exactly the same as find by hashing the provided key then finding the DataNode, however it returns a boolean based on whether that DataNode exists instead of the data.

This method is O(n) Time (All data collides and it results in one giant linked list) and O(1)