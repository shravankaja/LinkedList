package com.linkedlist;

import java.sql.*;

public class Queue<T> {
    public Stack stack;
    public INode<T> tail;
    public INode<T> head;
    public int lenght;

    public Queue(int lenght) {
        this.head = null;
        this.tail = null;
        this.stack = new Stack(lenght);
    }

    public void add(INode newNode) {
        stack.push(newNode);
    }

    public void peek() {
        stack.peekQueue();

    }

    public void pop() {
        stack.popQueue();
    }

}
