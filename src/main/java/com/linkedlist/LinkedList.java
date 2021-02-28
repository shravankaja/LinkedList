package com.linkedlist;

public class LinkedList<T> {
    public INode head;
    public INode tail;

    public LinkedList() {
        this.head = null;
        this.head = null;
    }

    public void addToLinkedListTest(INode newNode) {
        if (head == null) {
            this.head = newNode;
        }
        if (tail == null) {
            this.tail = newNode;
        } else {
            INode temp = this.head;
            this.head = newNode;
            this.head.setNext(temp);
        }
    }

    public void popLastElement() {
        if (head != tail) {
            INode temp = head;
            while (temp.getNext() != tail) {
                temp = temp.getNext();
            }

            this.tail = temp;
            INode tempOne = temp.getNext();
            tempOne = null;
        }
    }

    public void appendToLinkedList(INode newNode) {
        if (head == null) {
            this.head = newNode;
        }
        if (tail == null) {
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void insertToLinkedList(INode beforeNode, INode afterNode, INode newNode) {
        INode temp = beforeNode.getNext();
        beforeNode.setNext(newNode);
        newNode.setNext(afterNode);
    }

    public void popFirstElement() {
        this.head = this.head.getNext();
    }

    public void printLinkedList() {
        StringBuffer allNodes = new StringBuffer();
        INode temp = head;
        while (temp.getNext() != null) {
            allNodes.append(temp.getKey());
            if (!temp.equals(tail))
                allNodes.append("->");
            temp = temp.getNext();
        }
        allNodes.append(temp.getKey());
        System.out.println(allNodes);
    }

    public T searchUsingKey(T key) {
        INode temp = head;
        while (temp.getNext() != null) {
            if (temp.getKey().equals(key)) {
                System.out.println("Found");
            }
            temp = temp.getNext();
        }
        return key;
    }

    public void searchUsingKeyInsert(T key, INode newNode) {
        INode temp = head;
        INode tempAfter;
        while (temp.getNext() != null) {
            if (temp.getKey().equals(key)) {
                System.out.println("Found");
                tempAfter = temp.getNext();
                insertToLinkedList(temp, tempAfter, newNode);
            }
            temp = temp.getNext();
        }

    }

    public void printAfterPopLast() {
        StringBuffer allNodes = new StringBuffer();
        INode temp = head;
        while (temp.getNext() != null) {
            allNodes.append(temp.getKey());
            if (!temp.equals(tail))
                allNodes.append("->");
            temp = temp.getNext();
        }
        System.out.println(allNodes);
    }
}
