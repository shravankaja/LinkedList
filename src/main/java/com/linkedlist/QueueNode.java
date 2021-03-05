package com.linkedlist;

public class QueueNode<T extends Comparable<T>> implements INode<T> {
    public T key;
    public QueueNode<T> next;

    public QueueNode(T key) {
        this.key = key;
        this.next=null;
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
    public INode<T> getNext() {
        return next;
    }

    @Override
    public void setNext(INode next) {
        this.next = (QueueNode<T>) next;
    }
}
