package fifoanimalshelter;

public class Queue {
    protected Node front;
    protected Node back;
    public Queue() {
        this.front = null;
        this.back = null;
    }

    public void enqueue(String type, String name) {
        Node animal;
        switch (type.toLowerCase()) {
            case ("dog") :
                animal = new Dog(name);
                break;
            case ("cat") :
                animal = new Cat(name);
                break;
            default : return; //Shelter only handles dogs and cats.
        }
        if (this.front == null) {
            this.front = animal;
            this.back = animal;
        } else {
            this.back.next = animal;
            this.back = animal;
        }
    }

    public Node dequeue(String type) {
        switch (type.toLowerCase()) {

            // Type of Dog.
            case ("dog") : {
                Node curr = this.front;
                if (curr instanceof Dog) {
                    this.front = this.front.next;
                    curr.next = null;
                    return curr;
                } else {
                    Node temp;
                    while (curr != null) {
                        if (curr.next instanceof Dog) {
                            temp = curr.next;
                            curr.next = curr.next.next;
                            temp.next = null;
                            return temp;
                        }
                        curr = curr.next;
                    }
                }
                break;
            }

            // Type of Cat.
            case ("cat") : {
                Node curr = this.front;
                if (curr instanceof Cat) {
                    this.front = this.front.next;
                    curr.next = null;
                    return curr;
                } else {
                    Node temp;
                    while (curr != null) {
                        if (curr.next instanceof Cat) {
                            temp = curr.next;
                            curr.next = curr.next.next;
                            temp.next = null;
                            return temp;
                        }
                        curr = curr.next;
                    }
                }
                break;
            }

            // All other types including undefined type.
//            default : {
//                Node curr = this.front;
//                this.front = this.front.next;
//                curr.next = null;
//                return curr;
//            }
//            for some reason the compiler doesn't see this as covering all returns, moved to outside switch case.
        }
        Node curr = this.front;
        this.front = this.front.next;
        curr.next = null;
        return curr;
    }

}
