package com.rsilvaj.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SinglyIntegerLinkedListTest {

    private SinglyIntegerLinkedList list;

    @BeforeEach
    void setUp() {
        list = new SinglyIntegerLinkedList();
    }

    @Test
    void test_initialState_isEmpty() {
        assertEquals(0, list.size());
        assertEquals(-1, list.get(0));
    }

    @Test
    void test_addAtHead_multipleElements() {
        list.addAtHead(30);
        list.addAtHead(20);
        list.addAtHead(10);

        assertEquals(3, list.size());
        assertEquals(10, list.get(0));
        assertEquals(30, list.get(2));
    }

    @Test
    void test_addAtTail_maintainsOrder() {
        list.addAtTail(100);
        list.addAtTail(200);

        assertEquals(2, list.size());
        assertEquals(100, list.get(0));
        assertEquals(200, list.get(1));
    }

    @Test
    void test_addAtIndex_middleInsertion() {
        list.addAtTail(10);
        list.addAtTail(30);
        list.addAtIndex(1, 20);

        assertEquals(20, list.get(1));
        assertEquals(3, list.size());
    }

    @Test
    void test_removeAtIndex_head() {
        list.addAtHead(10);
        list.addAtHead(20);
        list.removeAtIndex(0);

        assertEquals(1, list.size());
        assertEquals(10, list.get(0));
    }

    @Test
    void test_removeAtIndex_middle() {
        list.addAtTail(10);
        list.addAtTail(20);
        list.addAtTail(30);
        list.removeAtIndex(1);

        assertEquals(2, list.size());
        assertEquals(10, list.get(0));
        assertEquals(30, list.get(1));
    }

    @Test
    void test_invalidIndex_returnsNegativeOne() {
        list.addAtHead(50);
        assertEquals(-1, list.get(-1));
        assertEquals(-1, list.get(5));
    }

}
