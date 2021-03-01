package com.linkedlist;

public class HashMap<T extends Comparable, V> {
    LinkedList<T> linkedList;

    public HashMap() {
        this.linkedList = new LinkedList<>();
    }

    public V get(T word) {
        MapNode<T, V> mapNode = (MapNode<T, V>) this.linkedList.search(word);
        return (mapNode == null) ? null : mapNode.getValue();
    }

    public void add(T word, V value) {
        MapNode<T, V> mapNode = (MapNode<T, V>) this.linkedList.search(word);
        if (mapNode == null) {
            mapNode = new MapNode<>(word, value);
            this.linkedList.appendToLinkedList(mapNode);
        } else {
            mapNode.setValue(value);
        }
    }

    @Override
    public String toString() {
        return "ap nodes {" + linkedList + '}';
    }
}
