package com.linkedlist;

import org.w3c.dom.*;

public interface INode<T> {
    T getKey();

    void setKey(T key);

    INode<T> getNext();

    void setNext(INode next);

}
