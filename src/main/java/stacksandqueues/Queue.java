package stacksandqueues;

public class Queue<T> {
    protected Node<T> front;
    protected Node<T> back;
    public Queue() {
        this.front = null;
        this.back = null;
    }

    public T peek() {
        if (this.front == null) return null;
        return this.front.value;
    }

    public void enqueue(T v) {
        Node<T> node = new Node<>(v);
        if (this.front == null) {
         this.front = node;
         this.back = node;
         return;
        }
        this.back.next = node;
        this.back = node;
    }

    public Node dequeue() {
        if (this.front == null) return null;
        Node node = this.front;
        this.front = this.front.next;
        return node;
    }

}
