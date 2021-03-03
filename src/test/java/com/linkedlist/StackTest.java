package com.linkedlist;

import org.junit.jupiter.api.*;

public class StackTest<T extends Comparable<T>> {

    @Test
    void stackTest() {
        Stack<T> stack = new Stack<T>(5);
        StackNode<Integer> stackFirstNode = new StackNode<>(76);
        StackNode<Integer> stackSecondNode = new StackNode<>(56);
        StackNode<Integer> stackThirdNode = new StackNode<>(30);
        stack.push(stackFirstNode);
        stack.push(stackSecondNode);
        stack.push(stackThirdNode);
        stack.peek();
        stack.pop();
        stack.peek();
        boolean result = stack.isEmpty();
        Assertions.assertEquals(false, result);
        int number = (int) stack.searchUsingKey(30);
        Assertions.assertEquals(number, 30);
    }
}
