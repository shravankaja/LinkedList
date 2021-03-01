package com.linkedlist;

public class ComparableNode {
    public int key;
    public ComparableNode next;

    public ComparableNode(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public ComparableNode getNext() {
        return next;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setNext(ComparableNode next) {
        this.next = next;
    }
}


