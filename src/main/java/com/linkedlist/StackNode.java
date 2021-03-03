package com.linkedlist;

public class StackNode<T extends Comparable<T>> implements INode<T> {
    public T key;
    public StackNode<T> next;

    public StackNode(T key) {
        this.key = key;
        this.next = null;
    }

    @Override
    public T getKey() {
        return key;
    }

    @Override
    public void setKey(T key) {
        this.key = key;

    }

    @Override
    public INode getNext() {
        return next;
    }

    @Override
    public void setNext(INode next) {
        this.next = (StackNode<T>) next;

    }
}
