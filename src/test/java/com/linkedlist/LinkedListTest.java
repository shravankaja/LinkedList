package com.linkedlist;

import org.junit.jupiter.api.*;

public class LinkedListTest {

    @Test
    public void testSimpleLinkedList() {
        MyNode<Integer> firstNode = new MyNode<>(70);
        MyNode<Integer> secondNode = new MyNode<>(56);
        MyNode<Integer> thirdNode = new MyNode<>(30);
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
        boolean result = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void addLinkedListTest() {
        MyNode<Integer> firstNode = new MyNode<>(70);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(56);
        LinkedList linkedList = new LinkedList();
        linkedList.addToLinkedListTest(firstNode);
        linkedList.addToLinkedListTest(secondNode);
        linkedList.addToLinkedListTest(thirdNode);
        boolean result = thirdNode.getNext().equals(secondNode) && secondNode.getNext().equals(firstNode);
        boolean resultOne = linkedList.head.equals(thirdNode) && linkedList.head.getNext().equals(secondNode) && linkedList.tail.equals(firstNode);
        Assertions.assertTrue(result);
        Assertions.assertTrue(resultOne);
        linkedList.printLinkedList();
    }
}
