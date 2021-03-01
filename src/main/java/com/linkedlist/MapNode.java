package com.linkedlist;

public class MapNode<T, V> implements INode<T> {
    T key;
    V value;
    MapNode<T,V> next;

    public MapNode(T key, V value) {
        this.key = key;
        this.value = value;
        next=null;
    }

    public MapNode() {

    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public T getKey() {
        return key;
    }

    @Override
    public void setKey(T key) {
        this.key=key;
    }

    @Override
    public INode<T> getNext() {
        return next;
    }

    @Override
    public void setNext(INode next) {
        this.next= (MapNode<T, V>) next;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("MapNode :{"+"K=").append(key).append(" V=").append(value).append('}');
        if(next!=null)
            stringBuilder.append("->").append(next);
        return stringBuilder.toString();
    }


}
