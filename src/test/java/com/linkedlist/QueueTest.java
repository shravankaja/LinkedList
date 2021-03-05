package com.linkedlist;

import org.junit.jupiter.api.*;

public class QueueTest {

    @Test
    void queueTest() {
        QueueNode<Integer> queueNodeSecond = new  QueueNode<>(20);
        QueueNode<Integer> queueNodeThird = new  QueueNode<>(30);
        Queue queue=new Queue(5);
        queue.add(queueNodeSecond);
        queue.add(queueNodeThird);
        queue.pop();
        queue.peek();
    }
}
