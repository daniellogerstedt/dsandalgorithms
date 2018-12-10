##December 10th: Stacks and Queues.

### -Stack-

### Challenge
Implement a Stack with 3 methods: Push, Peek, and Pop

### Approach & Efficiency

* ####Push
    The Push method takes the given value and creates a new Node placing it on the top of the stack with the next value pointed at the previous top.

    _**Push is O(1) Time and O(n) Space.**_

* ####Peek
    The Peek method looks at the current top and returns the value as either null (for an empty stack) or an Integer value (non primitive wrapper).

    _**Peek is O(1) Time and O(1) Space.**_

* ####Pop
    The Pop method takes the top Node off the stack returning it after setting the second node (top.next) as the new top.

    _**Pop is O(1) Time and O(1) Space.**_



### -Queue-

### Challenge
Implement a Queue with 3 methods: Enqueue, Peek, and Dequeue

### Approach & Efficiency

* ####Enqueue
    The Enqueue method takes the given value and creates a new Node placing it at the back of the queue with the next value of the previous back pointed at the new Node.

    _**Enqueue is O(1) Time and O(n) Space.**_

* ####Peek
    The Peek method looks at the current front and returns the value as either null (for an empty queue) or an Integer value (non primitive wrapper).

    _**Peek is O(1) Time and O(1) Space.**_

* ####Dequeue
    The Dequeue method takes the front Node off the queue returning it after setting the second node (front.next) as the new front.

    _**Dequeue is O(1) Time and O(1) Space.**_