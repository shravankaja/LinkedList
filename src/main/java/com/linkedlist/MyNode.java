package com.linkedlist;

public class MyNode<T extends Comparable<T>> implements INode<T> {
    public T key;
    public MyNode next;

    public MyNode(T key) {
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
        this.next = (MyNode) next;
    }


}

