package com.linkedlist;

public class Stack<T extends Comparable<T>> {
    public INode<T> tail;
    public INode<T> head;
    public int lenght;
    public int numberOfNodes = 0;


    public Stack(int lenght) {
        this.head = null;
        this.tail = null;
        this.lenght = lenght;
    }

    public void push(INode newNode) {
        if (numberOfNodes >= lenght) {
            System.out.println("Stack Full");
        } else {
            if (head == null) {
                this.head = newNode;
                numberOfNodes = numberOfNodes + 1;
            }
            if (tail == null) {
                this.tail = newNode;
            } else {
                INode temp = head;
                this.head = newNode;
                numberOfNodes = numberOfNodes + 1;
                newNode.setNext(temp);
            }
            System.out.println(numberOfNodes);
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(this.head.getKey());
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            if (head == null) {
                System.out.println("Stack is empty");
            }
            INode temp = head.getNext();
            this.head = temp;
        }
    }

    public boolean isEmpty() {
        if (head == null & tail == null) {
            return true;
        }
        return false;
    }

    public int searchUsingKey(int key) {
        INode temp = head;
        if (temp == null) {
            return 0;
        }
        if (temp.getKey().equals(key)) {
            System.out.println("Found");
        }
        while (temp.getNext() != null) {
            if (temp.getNext().getKey().equals(key)) {
                System.out.println("Found");
            }

            temp = temp.getNext();
        }
        return key;
    }
}
