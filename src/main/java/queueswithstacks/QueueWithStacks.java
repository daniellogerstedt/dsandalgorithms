package queueswithstacks;

public class QueueWithStacks<T> {

    protected Stack<T> inStack;
    protected Stack<T> outStack;

    public QueueWithStacks() {
        this.inStack = new Stack<T>();
        this.outStack = new Stack<T>();
    }

    public void enqueue (T val) {
        //takes in Value of type T Generic and passes it into the in stack.
        this.inStack.push(val);
    }

    public Node<T> dequeue() {
        this.cycleStacks();
        return this.outStack.pop();
    }

    public T peek() {
        this.cycleStacks();
        return this.outStack.top != null? this.outStack.top.value: null;
    }

    private void cycleStacks () {
        // Helper Method that dumps in stack into out stack if out is empty.
        if (this.outStack.top == null) {
            Node<T> curr = this.inStack.top;
            while (curr != null) {
                this.outStack.push(this.inStack.pop().value);
                curr = curr.next;
            }
        }
    }

}
