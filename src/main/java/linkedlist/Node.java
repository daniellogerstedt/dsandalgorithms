package linkedlist;

public class Node {
    int value;
    Node next;
    public Node(int val) {
        this.value = val;
        this.next = null;
    }

    public Node(int val, Node next) {
        this.value = val;
        this.next = next;
    }
}
