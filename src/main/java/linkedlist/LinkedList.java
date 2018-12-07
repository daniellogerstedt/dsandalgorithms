package linkedlist;

import com.sun.source.tree.DoWhileLoopTree;

public class LinkedList {

    Node head;
    public LinkedList() {
        this.head = null;
    }

    public void insert(int val){
        if (this.head != null) this.head = new Node(val, this.head);
        else this.head = new Node(val);
    }

    public boolean includes(int val){
        Node currentNode = this.head;
        while (currentNode != null) {
            if (currentNode.value == val) return true;
            currentNode = currentNode.next;
        }
        return false;
    }

    public void print(){
        Node currentNode = this.head;
        while (currentNode != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }

    public void append(int val) {
        Node nNode = new Node(val);
        if (this.head == null) this.head = nNode;
        else {
            Node currentNode = this.head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = nNode;
        }
    }

    public void insertBefore(int Value, int newValue) {
        Node currentNode = this.head;
        Node previousNode = null;
        while (currentNode.value != Value && currentNode != null) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        if (previousNode != null) previousNode.next = new Node(newValue, currentNode);
    }

    public void insertAfter(int Value, int newValue) {
        Node currentNode = this.head;
        while (currentNode.value != Value && currentNode != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(newValue, currentNode.next);
    }

    public int kFromEnd (int k) {
        int count = 0;
        Node curr = this.head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        int[] values = new int[count];
        curr = this.head;
        while (curr != null) {
            count--;
            values[count] = curr.value;
            curr = curr.next;
        }
        return values[k];
    }

    public static LinkedList merge(LinkedList One, LinkedList Two) {
        if (One.head == null) {
            One.head = Two.head;
            Two.head = null;
            return One;
        }
        if (Two.head == null) return One;
        Node currOne = One.head;
        Node currTwo = Two.head;
        Node nextOne;
        Node nextTwo;
        if (currOne != null) nextOne = currOne.next;
        else return Two;
        if (currTwo != null) nextTwo = currTwo.next;
        else return One;
        while (nextOne != null && nextTwo != null) {
            nextOne = currOne.next;
            nextTwo = currTwo.next;
            currOne.next = currTwo;
            currTwo.next = nextOne;
            currOne = nextOne;
            currTwo = nextTwo;
        }
        if (nextOne == null && nextTwo == null) return One;
        else if (nextOne == null) currOne.next = currTwo;
        else if (nextTwo == null) {
            currOne.next = currTwo;
            currTwo.next = nextOne;
        }
        Two.head = null;
        return One;
    }
}
