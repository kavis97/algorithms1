package pers.siva.algorithms.lists;

public class Node {

    int element;
    Node next;

    public Node(int element) {
        this.element = element;
        this.next = null;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public int getElement() {
        return element;
    }
}
