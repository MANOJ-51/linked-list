package com.linkedlist;

public class Node<M> {
    M key;
    Node next = null;

    public Node(M key) {
        this.key = key;
        this.next = next;
    }

    public M getKey() {
        return key;
    }

    public void setKey(M key) {
        this.key = key;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
