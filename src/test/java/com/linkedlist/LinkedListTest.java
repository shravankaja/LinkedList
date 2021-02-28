package com.linkedlist;

import org.junit.jupiter.api.*;

public class LinkedListTest {

    @Test
    public void testSimpleLinkedList() {
        MyNode<Integer> firstNode = new MyNode<>(70);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(56);
        LinkedList linkedList = new LinkedList();
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
        boolean resultOne = linkedList.head.equals(thirdNode) && linkedList.head.getNext().equals(secondNode) &&
                linkedList.tail.equals(firstNode);
        Assertions.assertTrue(result);
        Assertions.assertTrue(resultOne);
        System.out.println("Linked List after adding :");
        linkedList.printLinkedList();
    }

    @Test
    void appendLinkedListTest() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.appendToLinkedList(firstNode);
        linkedList.appendToLinkedList(secondNode);
        linkedList.appendToLinkedList(thirdNode);
        System.out.println("Linked list after appending :");
        linkedList.printLinkedList();
        boolean result = linkedList.head.equals(firstNode) && linkedList.head.getNext().equals(secondNode) &&
                linkedList.tail.equals(thirdNode);
        Assertions.assertTrue(result);
    }

    @Test
    void insertLinkedListTest() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> thirdNode = new MyNode<>(70);
        MyNode<Integer> secondNode = new MyNode<>(30);
        LinkedList linkedList = new LinkedList();
        linkedList.appendToLinkedList(firstNode);
        linkedList.appendToLinkedList(thirdNode);
        linkedList.insertToLinkedList(firstNode, thirdNode, secondNode);
        System.out.println("Linked list after inserting ");
        linkedList.printLinkedList();
        boolean result = linkedList.head.equals(firstNode) && linkedList.head.getNext().equals(secondNode)
                && linkedList.tail.equals(thirdNode);
        Assertions.assertTrue(result);
    }

    @Test
    void popLinkedListTest() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.appendToLinkedList(firstNode);
        linkedList.appendToLinkedList(secondNode);
        linkedList.appendToLinkedList(thirdNode);
        System.out.println("Linked list before delting :");
        linkedList.printLinkedList();
        System.out.println("Linked List after deleteing first element ");
        linkedList.popFirstElement();
        linkedList.printLinkedList();
        boolean result = linkedList.head.equals(secondNode) && linkedList.tail.equals(thirdNode);
        Assertions.assertTrue(result);
    }
}