package pers.siva.algorithms.lists;

import lombok.Getter;

public class SinglyLinkedList {
    private Node head;
    @Getter
    private int count;

    public void addToEnd(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            head = node;
        } else {
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        count++;
    }

    public void addToStart(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;

        count++;
    }

    public int[] getItems() {
        int[] result = new int[count];
        Node current = this.head;
        for (int i = 0; i < count; i++) {
            result[i] = current.getElement();
            current = current.next;
        }

        return result;
    }

    public void addAfter(int afterValue, int data) {
        Node node = new Node(data);
        Node current = this.head;
        while (current.next != null) {
            if (current.getElement() == afterValue) {
                node.next = current.next;
                current.next = node;
                count++;
                break;
            }
            current = current.next;
        }
    }

    public Node deleteAtEnd() {
        Node current = this.head;
        if (head == null || head.next == null) {
            head = null;
            return current;
        }

        Node nextNode = current.next;
        while (current.next != null) {
            if (nextNode.next == null) {
                current.next = null;
                count--;
            }
            current = nextNode;
            nextNode = nextNode.next;
        }
        return current;
    }
}
