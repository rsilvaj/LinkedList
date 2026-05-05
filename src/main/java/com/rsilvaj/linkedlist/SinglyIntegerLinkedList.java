package com.rsilvaj.linkedlist;

public class SinglyIntegerLinkedList {

    private final Node<Integer> dummyHead;
    private int size = 0;

    /**
     * Simple constructor
     * Initialize dummyHead - avoiding further validation of nullable head
     */
    public SinglyIntegerLinkedList() {
        dummyHead = new Node<>(null);
    }

    /**
     * Add node at the head position
     *
     * @param value Value of node
     */
    public void addAtHead(int value) {
        Node<Integer> newNode = new Node<>(value);
        newNode.setNext(dummyHead.getNext());
        dummyHead.setNext(newNode);
        size++;
    }

    /**
     * Add node at the tail
     *
     * @param value Value of node
     */
    public void addAtTail(int value) {
        Node<Integer> newNode = new Node<>(value);
        Node<Integer> current = dummyHead;
        while (current.getNext() != null) current = current.getNext();
        current.setNext(newNode);
        size++;
    }

    /**
     * Add node at index position
     *
     * @param index 0-indexed position
     * @param value Value of node
     * */
    public void addAtIndex(int index, Integer value) {
        if (index < 0 || index > size) return;
        Node<Integer> preview = dummyHead;
        for(int i = 0; i < index; i++) {
            preview = preview.getNext();
        }
        Node<Integer> newNode = new Node<>(value);
        Node<Integer> ref = preview.getNext();
        preview.setNext(newNode);
        newNode.setNext(ref);
        size++;
    }

    /**
     * Find element in index position
     *
     * @param index 0-indexed position
     * @return value of node, in case of index is bigger than size or lower than zero, returns -1
     */
    public Integer get(int index) {
        if (index < 0 || index >= size) return -1;
        if(index == 0) return dummyHead.getNext().getValue();
        Node<Integer> current = dummyHead;
        for(int i = 0; i <= index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    /**
     * Remove element at index
     *
     * @param index 0-indexed position
    */
    public void removeAtIndex(int index) {
        if (index < 0 || index >= size) return;
        Node<Integer> preview = dummyHead;
        for(int i = 0; i < index; i++) {
            preview = preview.getNext();
        }
        Node<Integer> ref = preview.getNext();
        preview.setNext(ref.getNext());
        size--;
    }

    /**
     * Retrieves size of Linked list
     *
     * @return size total of elements within the Linked list
     */
    public int size() {
        return this.size;
    }

}
