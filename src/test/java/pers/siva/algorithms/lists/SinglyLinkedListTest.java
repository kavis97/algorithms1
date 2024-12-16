package pers.siva.algorithms.lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SinglyLinkedListTest {

    private SinglyLinkedList list;

    @BeforeEach
    void setUp() {
        list = new SinglyLinkedList();
    }

    @Test
    void testAddToEnd() {
        list.addToEnd(1);
        list.addToEnd(2);
        list.addToEnd(3);
        assertEquals(3, list.getCount());
    }

    @Test
    void testAddToStart() {
        list.addToStart(1);
        list.addToStart(2);
        list.addToStart(3);
        assertEquals(3, list.getCount());
        int[] items = list.getItems();
        assertEquals(1, items[2]);
        assertEquals(2, items[1]);
        assertEquals(3, items[0]);
    }

    @Test
    void testAddAfter() {
        list.addToStart(4);
        list.addToStart(3);
        list.addToStart(1);
        list.addAfter(1, 2);
        assertEquals(4, list.getCount());
        int[] items = list.getItems();
        assertEquals(2, items[1]);
    }

    @Test
    void deleteEmptyAtEnd() {
        Node deletedNode = list.deleteAtEnd();
        Assertions.assertNull(deletedNode);
    }

    @Test
    void deleteAtEnd() {
        list.addToEnd(1);
        list.addToEnd(2);
        list.addToEnd(3);
        Node deletedNode = list.deleteAtEnd();
        assertEquals(2, list.getCount());
        int[] items = list.getItems();
        assertEquals(1, items[0]);
        assertEquals(2, items[1]);
        assertEquals(3, deletedNode.getElement());
    }
}