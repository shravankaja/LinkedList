package com.linkedlist;

public class LinkedList {
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
}
