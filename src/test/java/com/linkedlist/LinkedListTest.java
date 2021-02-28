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
}
