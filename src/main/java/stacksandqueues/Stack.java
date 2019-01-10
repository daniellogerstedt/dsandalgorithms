package stacksandqueues;

public class Stack<T> {
    protected Node<T> top;

    public Stack() {
        this.top = null;
    }

    public T peek() {
        if(this.top == null) return null;
        return this.top.value;
    }

    public void push(T v) {
        Node node = new Node(v, this.top);
        this.top = node;
    }

    public Node pop() {
        Node node = this.top;
        this.top = this.top.next;
        return node;
    }

    public boolean contains(T data) {
        Node curr = this.top;
        while (curr != null) {
            if (curr.value == data) return true;
            curr = curr.next;
        }
        return false;
    }

}
