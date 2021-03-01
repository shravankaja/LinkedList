package com.linkedlist;

import java.util.*;

public class IndexedLinkedList<T extends Comparable, V> {
    ArrayList<LinkedList<T>> bucketArray;
    private final int BUCKET;

    public IndexedLinkedList() {
        this.BUCKET = 10;
        this.bucketArray = new ArrayList<>(BUCKET);

        for (int i = 0; i < 10; i++) {
            this.bucketArray.add(null);
        }
    }

    public int getIndex(T key) {
        int hashCode = Math.abs(key.hashCode());
        int index = hashCode % BUCKET;
        return index;
    }

    public void add(T key, V value) {
        int index = getIndex(key);
        LinkedList<T> linkedList = this.bucketArray.get(index);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            this.bucketArray.set(index, linkedList);
        }
        MapNode<T, V> mapNode = (MapNode<T, V>) linkedList.search(key);
        if (mapNode == null) {
            mapNode = new MapNode<>(key, value);
            linkedList.appendToLinkedList(mapNode);
        } else {
            mapNode.setValue(value);
        }
    }

    public V get(T key) {
        int index = getIndex(key);
        LinkedList<T> linkedList = this.bucketArray.get(index);
        if (linkedList == null) {
            return null;
        }
        MapNode<T, V> mapNode = (MapNode<T, V>) linkedList.search(key);
        if (mapNode == null) {
            return null;

        } else {
            return mapNode.getValue();
        }
    }

    @Override
    public String toString() {
        return "IndexedHashMap {" + bucketArray + '}';
    }
}

