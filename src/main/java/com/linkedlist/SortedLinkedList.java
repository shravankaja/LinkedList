package com.linkedlist;

public class SortedLinkedList {

    public ComparableNode head;
    public ComparableNode tail;

    public SortedLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(ComparableNode newNode) {
        if (head == null) {
            this.head = newNode;
        }
        if (tail == null) {
            this.tail = newNode;
        }
        ComparableNode temp = head;
        if (temp.getKey() < newNode.getKey()) {
            if (temp.getNext() == null) {
                temp.setNext(newNode);
                this.tail = newNode;
            }
            while (temp.getNext() != null) {
                if (temp.getKey() < newNode.getKey()) {
                    if (temp.getNext() == null) {
                        temp.setNext(newNode);
                        this.tail = newNode;
                        break;

                    } else {
                        insert(temp, temp.getNext(), newNode);
                        break;

                    }
                }

            }
        }
    }

    public void insert(ComparableNode beforeNode, ComparableNode afterNode, ComparableNode newNode) {
        ComparableNode temp = beforeNode.getNext();
        beforeNode.setNext(newNode);
        newNode.setNext(afterNode);
    }

    public void printLinkedList() {
        StringBuffer allNodes = new StringBuffer();
        ComparableNode temp = head;
        while (temp.getNext() != null) {
            allNodes.append(temp.getKey());
            if (!temp.equals(tail))
                allNodes.append("->");
            temp = temp.getNext();
        }
        allNodes.append(temp.getKey());
        System.out.println(allNodes);
    }

    public static void main(String Args[]) {
        ComparableNode firstNode = new ComparableNode(20);
        ComparableNode secondNode = new ComparableNode(30);
        ComparableNode thirdNode = new ComparableNode(40);
        SortedLinkedList sortedLinkedList = new SortedLinkedList();
        sortedLinkedList.add(firstNode);
        sortedLinkedList.add(secondNode);
        sortedLinkedList.add(thirdNode);
        sortedLinkedList.printLinkedList();
    }
}
