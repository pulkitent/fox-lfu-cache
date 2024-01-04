package com.fox.cache;


public class DoublyLinkedList {

    private DLLNode head;
    private DLLNode tail;

    void addAtLast(DLLNode dllNode) {

        if (head == null) {
            head = dllNode;
            tail = dllNode;
            return;
        }

        tail.next = dllNode;

        if (dllNode != null) {
            dllNode.prev = tail;
        }
        tail = dllNode;
    }

    void removeGivenNode(DLLNode dllNode) {

        if (dllNode == head && dllNode == tail) {
            head = null;
            tail = null;
            return;
        }

        if (dllNode == head) {
            head = dllNode.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        if (dllNode == tail) {
            tail = dllNode.prev;
            if (tail != null) {
                tail.next = null;
            }
            return;
        }

        if (dllNode != null) {
            dllNode.prev.next = dllNode.next;
            dllNode.next.prev = dllNode.prev;
        }
    }

    public DLLNode getHead() {

        return head;
    }
}
