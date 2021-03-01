package com.linkedlist;

import org.junit.jupiter.api.*;

public class LinkedListTest<T> {

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
        System.out.println("Before Inserting");
        linkedList.printLinkedList();
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

    @Test
    void popLastLinkedListTest() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.appendToLinkedList(firstNode);
        linkedList.appendToLinkedList(secondNode);
        linkedList.appendToLinkedList(thirdNode);
        System.out.println("Linked list before delting :");
        linkedList.printLinkedList();
        System.out.println("Linked List after deleteing last element ");
        linkedList.popLastElement();
        linkedList.printAfterPopLast();
        boolean result = linkedList.head.equals(firstNode) && linkedList.tail.equals(secondNode);
        Assertions.assertTrue(result);
    }

    @Test
    void searchLinkedListTest() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.appendToLinkedList(firstNode);
        linkedList.appendToLinkedList(secondNode);
        linkedList.appendToLinkedList(thirdNode);
        T result = (T) linkedList.searchUsingKey(56);
        Assertions.assertEquals(56, result);
    }

    @Test
    void searchAndInsertLinkedListTest() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);
        MyNode<Integer> fourthNode = new MyNode<>(40);
        LinkedList linkedList = new LinkedList();
        linkedList.appendToLinkedList(firstNode);
        linkedList.appendToLinkedList(secondNode);
        linkedList.appendToLinkedList(thirdNode);
        System.out.println("LinkedList before search and insert");
        linkedList.printLinkedList();
        linkedList.searchUsingKeyInsert(30, fourthNode);
        System.out.println("Lined list after search and insert");
        linkedList.printLinkedList();
        boolean result = firstNode.getNext().equals(secondNode) &&
                secondNode.getNext().equals(fourthNode) && fourthNode.getNext().equals(thirdNode);
        Assertions.assertTrue(result);
    }

    @Test
    void searchAndDeleteLinkedListTest() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(40);
        MyNode<Integer> fourthNode = new MyNode<>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.appendToLinkedList(firstNode);
        linkedList.appendToLinkedList(secondNode);
        linkedList.appendToLinkedList(thirdNode);
        linkedList.appendToLinkedList(fourthNode);
        System.out.println("LinkedList before search and delete");
        linkedList.printLinkedList();
        System.out.println("After deleteion");
        linkedList.deleteUsingKey(40);
        linkedList.printLinkedList();
        boolean result = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(fourthNode);
        Assertions.assertTrue(result);
    }

   /* @Test
    void sortLinkedList() {
        ComparableNode firstNode = new ComparableNode(20);
        ComparableNode secondNode = new ComparableNode(30);
        ComparableNode thirdNode = new ComparableNode(40);
        SortedLinkedList sortedLinkedList = new SortedLinkedList();
        sortedLinkedList.add(firstNode);
        sortedLinkedList.add(secondNode);
        sortedLinkedList.add(thirdNode);
        sortedLinkedList.printLinkedList();
    }
    */

}