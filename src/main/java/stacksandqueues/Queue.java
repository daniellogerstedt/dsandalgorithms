package stacksandqueues;

public class Queue {
    protected Node front;
    protected Node back;
    public Queue() {
        this.front = null;
        this.back = null;
    }

    public Integer peek() {
        if (this.front == null) return null;
        return this.front.value;
    }

    public void enqueue(int v) {
        Node node = new Node(v);
        if (this.front == null) {
         this.front = node;
         this.back = node;
         return;
        }
        this.back.next = node;
        this.back = node;
    }

    public Node dequeue() {
        Node node = this.front;
        this.front = this.front.next;
        return node;
    }

}
