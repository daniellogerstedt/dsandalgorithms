package linkedlist;

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
}
