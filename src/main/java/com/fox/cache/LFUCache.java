package com.fox.cache;

import java.util.*;

public class LFUCache {

    private final Map<Integer, Integer> keyValueMap;
    private final Map<Integer, DLLNode> keyNodeMap;
    private final DoublyLinkedList doublyLinkedList;
    private final int capacity;
    private int currentSize = 0;

    public LFUCache(Integer capacity) {

        this.keyValueMap = new HashMap<>();
        this.keyNodeMap = new HashMap<>();
        this.capacity = capacity;
        this.doublyLinkedList = new DoublyLinkedList();
    }

    public Integer get(Integer key) {

        if (!keyValueMap.containsKey(key)) {
            return -1;
        }

        DLLNode dllNode = keyNodeMap.get(key);
        doublyLinkedList.removeGivenNode(dllNode);
        doublyLinkedList.addAtLast(dllNode);
        return keyValueMap.get(key);
    }

    public void put(Integer key, Integer value) {

        if (currentSize < capacity) {
            currentSize++;
            keyValueMap.put(key, value);
            DLLNode dllNode = new DLLNode(key);
            doublyLinkedList.addAtLast(dllNode);
            keyNodeMap.put(key, dllNode);
            return;
        }

        DLLNode dLLNodeToBeRemoved = doublyLinkedList.getHead();
        doublyLinkedList.removeGivenNode(dLLNodeToBeRemoved);
        keyNodeMap.remove(dLLNodeToBeRemoved.getKey());
        keyValueMap.remove(dLLNodeToBeRemoved.getKey());
        keyValueMap.put(key, value);
        currentSize++;
    }

}
