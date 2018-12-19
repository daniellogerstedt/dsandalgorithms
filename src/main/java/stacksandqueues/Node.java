package stacksandqueues;

public class Node<T> {
    public T value;
    Node next;
    public Node(T val) {
        this.value = val;
        this.next = null;
    }

    public Node(T val, Node next) {
        this.value = val;
        this.next = next;
    }
}
