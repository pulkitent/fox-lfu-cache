package com.fox.cache;

public class DLLNode {

    private final int key;
    DLLNode next;
    DLLNode prev;

    public DLLNode(int key) {

        this.key = key;
    }

    public int getKey() {

        return key;
    }
}
