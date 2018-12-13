package multibracketvalidation;

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
        Node<T> node = new Node<T>(v, this.top);
        this.top = node;
    }

    public Node<T> pop() {
        Node<T> node = this.top;
        this.top = this.top.next;
        return node;
    }

}
