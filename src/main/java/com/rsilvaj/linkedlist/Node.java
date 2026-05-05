package com.rsilvaj.linkedlist;

public class Node<E> {

    private E value;
    private Node next;

    public Node(E value) {
        this.value = value;
    }

    public Node(E value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public E getValue() {
        return value;
    }
}
